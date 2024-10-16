-- CreateTable
CREATE TABLE `User` (
    `id` INTEGER NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(191) NOT NULL,
    `calefaccionOffset` DOUBLE NOT NULL DEFAULT 0,
    `calefaccionMinima` DOUBLE NOT NULL DEFAULT 1,
    `calefaccionMaxima` DOUBLE NOT NULL DEFAULT 100,
    `rango` DOUBLE NOT NULL DEFAULT 10,

    PRIMARY KEY (`id`)
) DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- CreateTable
CREATE TABLE `Config` (
    `id` INTEGER NOT NULL AUTO_INCREMENT,
    `userId` INTEGER NOT NULL,
    `sondas` VARCHAR(191) NOT NULL,
    `rele` VARCHAR(191) NOT NULL DEFAULT 'No asignado',
    `histeresis` DOUBLE NOT NULL DEFAULT 0.5,
    `temperaturaSonda` DOUBLE NOT NULL DEFAULT -10,
    `porcentaje` DOUBLE NOT NULL DEFAULT 0,
    `releAsignado` VARCHAR(191) NULL,
    `activado` BOOLEAN NOT NULL DEFAULT false,

    PRIMARY KEY (`id`)
) DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- AddForeignKey
ALTER TABLE `Config` ADD CONSTRAINT `Config_userId_fkey` FOREIGN KEY (`userId`) REFERENCES `User`(`id`) ON DELETE RESTRICT ON UPDATE CASCADE;
