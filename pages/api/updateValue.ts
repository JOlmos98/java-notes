import { NextApiRequest, NextApiResponse } from 'next';

// Mock de base de datos para la demostración
let mockDatabase: { [key: string]: any } = {
    user1: { calefaccionOffset: 20, calefaccionMinima: 15, calefaccionMaxima: 25, rango: 22 },
    // Añade más usuarios según sea necesario
};

export default async function handler(req: NextApiRequest, res: NextApiResponse) {
    // Solo aceptamos solicitudes POST
    if (req.method === 'POST') {
        const { value } = req.body; // Extraemos el nuevo valor del cuerpo de la solicitud

        if (!value) {
            return res.status(400).json({ error: 'Se requiere un valor.' });
        }

        // Aquí puedes añadir lógica para actualizar el valor en la base de datos
        // Por ejemplo, si estás usando un ORM o una consulta SQL
        // Aquí, como ejemplo, solo actualizaremos un valor en el mock de base de datos
        // Suponiendo que estás actualizando 'calefaccionOffset' para 'user1'

        // Si estás utilizando una identificación de usuario, asegúrate de extraerla de algún lugar
        const userId = 'user1'; // Cambia esto según tu lógica

        // Actualiza el valor en la "base de datos"
        if (mockDatabase[userId]) {
            mockDatabase[userId].calefaccionOffset = value; // Actualiza el campo deseado
            return res.status(200).json({ message: 'Valor actualizado exitosamente.' });
        } else {
            return res.status(404).json({ error: 'Usuario no encontrado.' });
        }
    } else {
        // Si la solicitud no es un POST, respondemos con un error 405
        res.setHeader('Allow', ['POST']);
        return res.status(405).json({ error: `Método ${req.method} no permitido.` });
    }
}
