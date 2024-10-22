import { NextApiRequest, NextApiResponse } from "next";
import prisma from "../../lib/prisma"; // Asegúrate de que la ruta es correcta
import { config } from "process";

export default async function handler(req: NextApiRequest, res: NextApiResponse) {
  if (req.method === "GET") {
    const { configId } = req.query; // Obtener el condigId de la consulta
    const configIdNum = Number(configId); // Convertir a número

    // Validar userId
    if (!configId || isNaN(configIdNum)) {
      return res.status(400).json({ message: "ID de usuario inválido." });
    }

    try {
      // Obtener todos los datos del usuario
      const user = await prisma.user.findUnique({
        where: { id: configIdNum }, // Usar el configId convertido a número
        //include: {
          //configs: true, // Esto se comenta porque ahora queremos el propio config, no el user. (Incluye las configuraciones si necesitas)
        //},
      });

      if (config) {
        return res.status(200).json(config); // Devuelve todos los datos del usuario
      } else {
        return res.status(404).json({ message: "Config no encontrada." });
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
