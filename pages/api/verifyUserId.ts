// pages/api/verifyUserId.ts
import { NextApiRequest, NextApiResponse } from "next";
import prisma from "../../lib/prisma"; // Asegúrate de que la ruta es correcta

export default async function handler(req: NextApiRequest, res: NextApiResponse) {
  if (req.method === "POST") {
    const { userId } = req.body;

    try {
      // Buscar el usuario en la base de datos
      const user = await prisma.user.findUnique({
        where: { id: Number(userId) }, // Asegúrate de que userId es un número
      });

      if (user) {
        // Devuelve el nombre del usuario en la respuesta
        return res.status(200).json({ 
          message: "User ID válido.", 
          userName: user.name // Asegúrate de que el campo es 'name' en tu modelo
        });
      } else {
        return res.status(404).json({ message: "User ID no válido." });
      }
    } catch (error) {
      return res.status(500).json({ message: "Error al verificar el User ID." });
    }
  } else {
    res.setHeader("Allow", ["POST"]);
    return res.status(405).end(`Method ${req.method} Not Allowed`);
  }
}
/* 
Hemos modificado este archivo apra que verifique el userId 
introducidos y muestre un mensaje u otro según exista
o no en la base de datos, en caso de que sí, vamos a la página UserIn y
alli mostrará un mensaje de bienvenida mostrando el nombre del usuario.
*/