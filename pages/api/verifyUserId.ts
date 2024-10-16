// pages/api/verifyUserId.ts
import { NextApiRequest, NextApiResponse } from 'next';
import { PrismaClient } from '@prisma/client';

const prisma = new PrismaClient();

export default async function handler(req: NextApiRequest, res: NextApiResponse) {
  if (req.method === 'POST') {
    const { userId } = req.body;

    try {
      // Verificar si el userId existe en la tabla User
      const user = await prisma.user.findUnique({
        where: { id: Number(userId) },
      });

      if (user) {
        // El userId existe
        return res.status(200).json({ exists: true });
      } else {
        // El userId no existe
        return res.status(404).json({ exists: false });
      }
    } catch (error) {
      console.error(error);
      return res.status(500).json({ error: 'Internal Server Error' });
    }
  } else {
    res.setHeader('Allow', ['POST']);
    return res.status(405).end(`Method ${req.method} Not Allowed`);
  }
}
