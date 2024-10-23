// app/UserIn.tsx
"use client";
import React, { useEffect, useState } from "react";
import { useRouter } from "next/navigation";
import { PencilIcon } from "@primer/octicons-react"

export default function UserIn() {
    const [userData, setUserData] = useState<any>(null); // Cambiado a userData
    const [configData, setConfigData]=useState<any>(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState("");

    useEffect(() => {
        const fetchUserData = async () => {
            const urlParams = new URLSearchParams(window.location.search);
            const userId = urlParams.get("userId"); // Obtener el userId de la query

            if (userId) {
                try {
                    const response = await fetch(`/api/getUserData?userId=${userId}`); // Cambiado a la nueva API
                    const response2=await fetch(`/api/getConfigData?configId=${userId}`);
                    if (!response.ok) {
                        throw new Error("Error al obtener los datos del usuario."); // Mensaje de error
                    }
                    const data = await response.json(); // Parsear la respuesta JSON
                    const data2=await response2.json();
                    setUserData(data); // Establecer los datos del usuario
                    setConfigData(data2);
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

    const router=useRouter();

    const handleEdit = (parameter: string) => {
        // Redirigir a la página changeValue con un parámetro en la query
        const userId = userData.id; // O de donde estés obteniendo el userId
        router.push(`/changeValue?parameter=${encodeURIComponent(parameter)}&userId=${encodeURIComponent(userId)}`);
    }; //Parece que el handleEdit ya va a funcionar pasando el parámetro y el userId a la página changeValue

    return (
        <div className="grid grid-rows-[1fr_auto] items-center gap-14 justify-items-center m-auto font-[family-name:var(--font-geist-sans)]">
            <main className="flex flex-col gap-14 row-start-2 items-center sm:items-start">
                <span className="flex bg-blue-300 bg-opacity-30 rounded-3xl p-4 m-auto gap-8 text-5xl">
                    Bienvenido/a {userData.name}.
                </span>
                
                <div className="flex flex-col bg-blue-100 bg-opacity-70 p-8 m-1 rounded-3xl shadow-lg w-[768px]">
                    <h2 className="text-4xl mb-6 font-semibold text-blue-900">Datos del Usuario</h2>
    
                    <table className="table-auto w-full text-left text-blue-800">
                        <tbody>
                            <tr className="border-b-2 border-gray-500">
                                <td className="p-2 font-medium text-xl">Calefacción Offset:</td>
                                <td className="p-1 text-xl">{userData.calefaccionOffset}</td>
                                <td className="p-0 text-xl">Cº</td>
                                <td>
                                    <button type="button" onClick={() => handleEdit('calefaccionOffset')}  className="flex bg-blue-600 bg-opacity-30 p-2 mx-auto rounded-xl text-1xl"><PencilIcon className="m-0"/></button>
                                </td>
                            </tr>
                            <tr className="border-b-2 border-gray-500">
                                <td className="p-2 font-medium text-xl">Calefacción Mínima:</td>
                                <td className="p-1 text-xl">{userData.calefaccionMinima}</td>
                                <td className="p-0 text-xl">%</td>
                                <td>
                                    <button type="button" onClick={() => handleEdit('calefaccionOffset')}  className="flex bg-blue-600 bg-opacity-30 p-2 mx-auto rounded-xl text-1xl"><PencilIcon className="m-0"/></button>
                                </td>
                            </tr>
                            <tr className="border-b-2 border-gray-500">
                                <td className="p-2 font-medium text-xl">Calefacción Máxima:</td>
                                <td className="p-1 text-xl">{userData.calefaccionMaxima}</td>
                                <td className="p-0 text-xl">%</td>
                                <td>
                                    <button type="button" onClick={() => handleEdit('calefaccionOffset')}  className="flex bg-blue-600 bg-opacity-30 p-2 mx-auto rounded-xl text-1xl"><PencilIcon className="m-0"/></button>
                                </td>
                            </tr>
                            <tr className="border-b-2 border-gray-500">
                                <td className="p-2 font-medium text-xl">Rango:</td>
                                <td className="p-1 text-xl">{userData.rango}</td>
                                <td className="p-0 text-xl">Cº</td>
                                <td>
                                    <button type="button" onClick={() => handleEdit('calefaccionOffset')}  className="flex bg-blue-600 bg-opacity-30 p-2 mx-auto rounded-xl text-1xl"><PencilIcon className="m-0"/></button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
    
                    <h2 className="text-2xl mt-8 mb-4 font-semibold text-blue-900">Configuraciones:</h2>
    
                    {userData.configs && userData.configs.length > 0 ? (
                        <ul className="list-disc pl-8 text-blue-800">
                            {userData.configs.map((config: any) => (
                                <li key={config.id} className="py-1">
                                    {JSON.stringify(config)}
                                </li>
                            ))}
                        </ul>
                    ) : (
                        <p className="text-left text-blue-600">No hay configuraciones disponibles. </p>
                    )}

                    <h2 className="text-2xl mt-8 mb-4 font-semibold text-blue-900">Configuraciones:</h2>    
                </div>
            </main>
        </div>
    );
}
