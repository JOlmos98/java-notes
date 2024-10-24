import { PrismaClient } from '@prisma/client'

const prisma = new PrismaClient()





// A `main` function so that we can use async/await
  // Seed the database with users and posts
  
  // Use of crateMany for creating many users at the same time.
async function main() {


      /*const users = await prisma.user.createMany({
      data: [
        { name: 'John Doe', calefaccionOffset: 1.5, calefaccionMinima: 5, calefaccionMaxima: 80, rango: 12 },
        { name: 'Jane Smith', calefaccionOffset: 2.0, calefaccionMinima: 10, calefaccionMaxima: 70, rango: 15 },
        { name: 'Mike Johnson', calefaccionOffset: 1.2, calefaccionMinima: 3, calefaccionMaxima: 60, rango: 20 },
        { name: 'Mishel González', calefaccionOffset: 1.2, calefaccionMinima: 3, calefaccionMaxima: 60, rango: 20 },
        { name: 'José Manuel González', calefaccionOffset: 1.2, calefaccionMinima: 3, calefaccionMaxima: 60, rango: 20 },

      ],
      skipDuplicates: true, 
    })
  
    console.log('Usuarios creados:', users)
  
    const createdUsers = await prisma.user.findMany()
  
    const configs = await prisma.config.createMany({
      data: [
        { userId: createdUsers[0].id, sondas: 'Asignado', rele: 'Relé 1', histeresis: 0.7, temperaturaSonda: 20, porcentaje: 50, releAsignado: 'Relé A', activado: true },
        { userId: createdUsers[1].id, sondas: 'No asignado', rele: 'Relé 2', histeresis: 0.5, temperaturaSonda: 18, porcentaje: 40, releAsignado: 'Relé B', activado: false },
        { userId: createdUsers[2].id, sondas: 'Asignado', rele: 'Relé 3', histeresis: 0.6, temperaturaSonda: 22, porcentaje: 60, releAsignado: 'Relé C', activado: true },
        { userId: createdUsers[4].id, sondas: 'No Asignado', rele: 'Relé 1', histeresis: 0.9, temperaturaSonda: 28, porcentaje: 65, releAsignado: 'Relé C', activado: true },

      ],
      skipDuplicates: true,
    })
  
    console.log('Configuraciones creadas:', configs)*/
  }
  
  /* Basic use of how insert a register.
  async function main() {

    const newUser = await prisma.user.create({
      data: {
        name: 'John Doe',
        calefaccionOffset: 1.5,
        calefaccionMinima: 5,
        calefaccionMaxima: 80,
        rango: 12,
      },
    })

    console.log('Nuevo usuario creado:', newUser)

    const newConfig = await prisma.config.create({
      data: {
        userId: newUser.id, 
        sondas: 'Asignado',
        rele: 'Relé 1',
        histeresis: 0.7,
        temperaturaSonda: 20,
        porcentaje: 50,
        releAsignado: 'Relé A',
        activado: true,
      },
    })
  
    console.log('Nueva configuración creada:', newConfig)
  }*/

main()
  .then(async () => {
    await prisma.$disconnect()
  })
  .catch(async (e) => {
    console.error(e)
    await prisma.$disconnect()
    process.exit(1)
  })
