"use client";
import { CheckIcon } from "@primer/octicons-react"
import { XIcon } from "@primer/octicons-react"
import { useRouter } from "next/navigation";
import { useState } from "react";


export default function ChangeValue(){
    const router=useRouter();
    const [value, setValue] = useState(""); // Estado para el valor ingresado


    const handleCancel = () => {
        router.back(); // Vuelve a la página anterior
    };
    //const handleEdit
    const handleCheck = async () => {
        try {
            const response = await fetch('/api/updateValue', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ value }), // Enviar el nuevo valor
            });

            if (!response.ok) {
                throw new Error('Error al actualizar el valor en la base de datos.');
            }

            // Redirigir a la página anterior o donde sea necesario
            router.back(); // Cambia la ruta según sea necesario
        } catch (error) {
            console.error(error); // Manejo de errores
        }
    };

    return (
<div className="grid grid-rows-[20px_1fr_20px] min-h-screen p-8 pb-20 gap-16 sm:p-20 font-[family-name:var(--font-geist-sans)]">
    <main className="flex flex-col gap-8 row-start-2 items-center justify-center sm:items-start">
        <span className="flex flex-col items-center bg-blue-300 bg-opacity-30 p-5 m-2 rounded-3xl text-center text-2xl">
            Establece un valor 
            <br />
            <input
                className="text-black p-2 m-2 w-full border border-blue-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500"
                type="text"
                placeholder="Ingresa un valor" // Placeholder opcional
            />
            <div className="flex justify-center gap-4">
                <button type="button" onClick={() => handleCancel()} className="flex bg-blue-600 bg-opacity-30 p-2 rounded-xl">
                    <XIcon size={24} className="p-0 m-2" />
                </button>
                <button type="submit" onClick={() => handleCheck()} className="flex bg-blue-600 bg-opacity-30 p-2 rounded-xl">
                    <CheckIcon size={24} className="p-0 m-2" />
                </button>
            </div>
        </span>
    </main>
</div>

    );
}