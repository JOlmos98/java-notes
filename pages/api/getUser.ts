import { NextApiRequest, NextApiResponse } from "next";
import prisma from "../../lib/prisma"; // Asegúrate de que la ruta es correcta

export default async function handler(req: NextApiRequest, res: NextApiResponse) {
  if (req.method === "GET") {
    const { userId } = req.query; // Obtén el userId de la consulta

    try {
      // Buscar el usuario en la base de datos
      const user = await prisma.user.findUnique({
        where: { id: Number(userId) }, // Asegúrate de que userId es un número
      });

      if (user) {
        return res.status(200).json(user); // Envía el usuario como respuesta
      } else {
        return res.status(404).json({ message: "Usuario no encontrado." });
      }
    } catch (error) {
      return res.status(500).json({ message: "Error al obtener el usuario." });
    }
  } else {
    res.setHeader("Allow", ["GET"]);
    return res.status(405).end(`Method ${req.method} Not Allowed`);
  }
}
