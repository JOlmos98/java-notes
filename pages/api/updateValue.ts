import { NextApiRequest, NextApiResponse } from 'next';
import prisma from "../../lib/prisma"; // Si usas Prisma, o el ORM/biblioteca que uses para interactuar con la base de datos

export default async function handler(req: NextApiRequest, res: NextApiResponse) {
    if (req.method === 'POST') {
        try {
            const { value, parameter, userId } = req.body;

            // Validar que se han recibido los parámetros necesarios
            if (!value || !parameter || !userId) {
                return res.status(400).json({ message: 'Faltan datos necesarios.' });
            }

            // Actualizar el valor en la base de datos
            // Suponiendo que uses Prisma y tienes un modelo User con los campos a actualizar
            const updatedUser = await prisma.user.update({
                where: { id: userId },
                data: {
                    [parameter]: value, // Actualiza el campo correspondiente dinámicamente
                },
            });

            // Si la actualización fue exitosa
            return res.status(200).json({ message: 'Valor actualizado con éxito.', updatedUser });

        } catch (error) {
            console.error('Error al actualizar el valor:', error);
            return res.status(500).json({ message: 'Error interno del servidor.' });
        }
    } else {
        // Manejar otros métodos HTTP que no sean POST
        res.setHeader('Allow', ['POST']);
        res.status(405).end(`Método ${req.method} no permitido`);
    }
}
