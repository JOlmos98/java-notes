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
                
                <div className="flex flex-col bg-blue-100 bg-opacity-70 p-8 m-2 rounded-3xl shadow-lg w-full sm:w-auto">
                    <h2 className="text-4xl mb-6 font-semibold text-blue-900">Datos del Usuario</h2>
    
                    <table className="table-auto w-full text-left text-blue-800">
                        <tbody>
                            <tr className="border-b-2 border-gray-500">
                                <td className="p-4 font-medium text-xl">Calefacción Offset:</td>
                                <td className="p-4 text-xl">{userData.calefaccionOffset}</td>
                            </tr>
                            <tr className="border-b-2 border-gray-500">
                                <td className="p-4 font-medium text-xl">Calefacción Mínima:</td>
                                <td className="p-4 text-xl">{userData.calefaccionMinima}</td>
                            </tr>
                            <tr className="border-b-2 border-gray-500">
                                <td className="p-4 font-medium text-xl">Calefacción Máxima:</td>
                                <td className="p-4 text-xl">{userData.calefaccionMaxima}</td>
                            </tr>
                            <tr className="border-b-2 border-gray-500">
                                <td className="p-4 font-medium text-xl">Rango:</td>
                                <td className="p-4 text-xl">{userData.rango}</td>
                            </tr>
                        </tbody>
                    </table>
    
                    <h2 className="text-3xl mt-8 mb-4 font-semibold text-blue-900">Configuraciones:</h2>
    
                    {userData.configs && userData.configs.length > 0 ? (
                        <ul className="list-disc pl-8 text-blue-800">
                            {userData.configs.map((config: any) => (
                                <li key={config.id} className="py-1">
                                    {JSON.stringify(config)}
                                </li>
                            ))}
                        </ul>
                    ) : (
                        <p className="text-blue-600">No hay configuraciones disponibles.</p>
                    )}
                </div>
            </main>
        </div>
    );
}
