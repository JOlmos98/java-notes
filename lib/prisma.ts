// lib/prisma.ts
import { PrismaClient } from '@prisma/client';

const prisma = new PrismaClient();

export default prisma;

/*
Este archivo era necesario para el pages/api/verifyUserId.ts donde 
usamos estas dos lineas:

import prisma from "../../lib/prisma";

y 

const user = await prisma.user.findUnique({
        where: { id: Number(userId) },
      });
*/