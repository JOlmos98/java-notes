import { NextApiRequest, NextApiResponse } from "next";
import prisma from "../../lib/prisma"; // Asegúrate de que la ruta es correcta

export default async function handler(req: NextApiRequest, res: NextApiResponse) {
  if (req.method === "GET") {
    const { userId } = req.query; // Obtener el userId de la consulta
    const userIdNum = Number(userId); // Convertir a número

    // Validar userId
    if (!userId || isNaN(userIdNum)) {
      return res.status(400).json({ message: "ID de usuario inválido." });
    }

    try {
      // Obtener todos los datos del usuario
      const user = await prisma.user.findUnique({
        where: { id: userIdNum }, // Usar el userId convertido a número
        include: {
          configs: true, // Incluye las configuraciones si necesitas
        },
      });

      if (user) {
        return res.status(200).json(user); // Devuelve todos los datos del usuario
      } else {
        return res.status(404).json({ message: "Usuario no encontrado." });
      }
    } catch (error) {
      console.error(error);
      return res.status(500).json({ message: "Error al obtener los datos del usuario." });
    }
  } else {
    res.setHeader("Allow", ["GET"]);
    return res.status(405).end(`Method ${req.method} Not Allowed`);
  }
}
