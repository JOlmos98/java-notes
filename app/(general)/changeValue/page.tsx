"use client";
import { useRouter } from 'next/navigation';
import { useSearchParams } from 'next/navigation';
import { CheckIcon, XIcon } from "@primer/octicons-react";
import { useState, useEffect } from 'react';

export default function ChangeValue() {
    const router = useRouter();
    const searchParams = useSearchParams();

    // Usar un estado para los parámetros, asegurando que no sean null
    const [parameter, setParameter] = useState<string>("");
    const [userId, setUserId] = useState<string>("");
    const [value, setValue] = useState("");

    // Este efecto se ejecuta cuando searchParams cambia
    useEffect(() => {
        if (searchParams) {
            const param = searchParams.get('parameter');
            const id = searchParams.get('userId');
            setParameter(param || ""); // Asigna el valor o una cadena vacía si es null
            setUserId(id || ""); // Asigna el valor o una cadena vacía si es null
        }
    }, [searchParams]);

    const handleCancel = () => {
        router.back();
    };

    const handleCheck = async () => {
        // Convertir el valor a número
        const numericValue = parseFloat(value); // Usa parseFloat si necesitas un número decimal
    
        // Validar que el valor sea un número
        if (isNaN(numericValue)) {
            console.error("El valor ingresado no es un número válido.");
            return; // O mostrar un mensaje al usuario
        }

        const userIdInt = parseInt(userId, 10); // Convertir userId a entero

        // Validar que userId sea un número válido
        if (isNaN(userIdInt)) {
            console.error("El userId ingresado no es un número válido.");
            return; // O mostrar un mensaje al usuario
        }
        try {
            const response = await fetch('/api/updateValue', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ value:numericValue, parameter, userId:userIdInt }), // Enviar el nuevo valor, el parámetro y el userId
            });

            if (!response.ok) {
                throw new Error('Error al actualizar el valor en la base de datos.');
            }

            // Redirigir a la página userData con el userId
            router.push(`/userData?userId=${encodeURIComponent(userId)}`);
        } catch (error) {
            console.error(error); // Manejo de errores
        }
    };

    return (
<div className="flex items-center justify-center pt-60 pb-60 m-auto font-[family-name:var(--font-geist-sans)]">
    <main className="flex flex-col gap-8 items-center">
        <span className="flex flex-col items-center justify-center gap-3 bg-blue-300 bg-opacity-30 p-5 m-2 rounded-3xl text-center text-2xl">
            Establece un valor 
            <br />
            <input
                className="text-black p-2 m-2 w-full border border-blue-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500"
                type="text"
                placeholder="Ingresa un valor" // Placeholder opcional
                value={value}
                onChange={(e) => setValue(e.target.value)}
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