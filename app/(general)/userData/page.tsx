// app/UserIn.tsx
"use client";
import React, { useEffect, useState } from "react";

export default function UserIn() {
    const [userData, setUserData] = useState<any>(null); // Cambiado a userData
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState("");

    useEffect(() => {
        const fetchUserData = async () => {
            const urlParams = new URLSearchParams(window.location.search);
            const userId = urlParams.get("userId"); // Obtener el userId de la query

            if (userId) {
                try {
                    const response = await fetch(`/api/getUserData?userId=${userId}`); // Cambiado a la nueva API
                    if (!response.ok) {
                        throw new Error("Error al obtener los datos del usuario."); // Mensaje de error
                    }
                    const data = await response.json(); // Parsear la respuesta JSON
                    setUserData(data); // Establecer los datos del usuario
                } catch (e: any) {
                    setError(e.message); // Manejar errores
                } finally {
                    setLoading(false); // Cambiar el estado de carga
                }
            } else {
                setError("ID de usuario no proporcionado."); // Manejar caso sin userId
                setLoading(false); // Cambiar el estado de carga
            }
        };

        fetchUserData();
    }, []);

    if (loading) {
        return <div>Cargando...</div>;
    }

    if (error) {
        return <div>Error: {error}</div>;
    }

    return (
        <div className="grid grid-rows-[20px_1fr_20px] items-center justify-items-center min-h-screen p-8 pb-20 gap-16 sm:p-20 font-[family-name:var(--font-geist-sans)]">
            <main className="flex flex-col gap-8 row-start-2 items-center sm:items-start">
                <span className="flex bg-blue-300 bg-opacity-30 p-5 m-2 rounded-3xl text-7xl">
                    Bienvenido {userData.name}!
                </span>
                <div>
                    <h2>Datos del Usuario</h2>
                    <p>Calefacción Offset: {userData.calefaccionOffset}</p>
                    <p>Calefacción Mínima: {userData.calefaccionMinima}</p>
                    <p>Calefacción Máxima: {userData.calefaccionMaxima}</p>
                    <p>Rango: {userData.rango}</p>
                    <h2>Configuraciones:</h2>
                    {userData.configs && userData.configs.length > 0 ? (
                        <ul>
                            {userData.configs.map((config: any) => (
                                <li key={config.id}>{JSON.stringify(config)}</li>
                            ))}
                        </ul>
                    ) : (
                        <p>No hay configuraciones disponibles.</p>
                    )}
                </div>
            </main>
        </div>
    );
}
