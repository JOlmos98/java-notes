"use client";

//import Image from "next/image";
import React, { useState } from "react";
import { useRouter } from "next/navigation";
import { redirect } from "next/dist/server/api-utils";
import { availableMemory } from "process";

export default function Home() {

  const [userId, setUserId] = useState("");
  const [message, setMessage] = useState("");
  const router=useRouter();

  const handleSubmit=async(e:React.FormEvent)=>{
    e.preventDefault();
    const res=await fetch("/api/verifyUserId", {
      method:"POST",
      headers:{
        "Content-Type":"application/json",
      },
      body:JSON.stringify({userId}),
    });
    const data=await res.json();
    //if (res.ok){
      //router.push(`/general/userIn?userId=${encodeURIComponent(userId)}`);

      //Con esto redirigimos a UserIn, esto queda obsoleto porque ahora importamos next/navigation
      //router.push( 
        //pathname: './(general)/userIn/page.tsx',
        //query: {name:data.userName}
      //);
    //} else {
      //setMessage(data.message);
    //}
    
    if (res.ok) {
      alert("El ID es correcto: "+userId+" "+typeof(userId)); // Ventana emergente si el ID es correcto
      router.push(`/userData?userId=${encodeURIComponent(userId)}`);
      console.log("userId:", userId);

    } else {
      alert("ID inválido"); // Ventana emergente si el ID no es válido
    }
  };


  //HTML que define la web: [10px_1fr_10px]
  return (
    <div className="grid grid-rows-[1fr_auto] items-center justify-items-center m-5 font-[family-name:var(--font-geist-sans)]">
      <h1 className="flex p-3 gap-6 rounded-3xl  text-8xl">CTIcontrol</h1>
      <main className="flex flex-col gap-6 row-start-2 items-center sm:items-start">
        <span className="flex text-3xl">Bienvenido a la interfaz de usuario de [insertar nombre de hardware].</span>
        <span className="flex text-3xl">Introduce tu número de usuario:</span>
        
        <input 
          typeof="text"
          value={userId}
          onChange={(e)=>setUserId(e.target.value)}
          className="text-black block mx-auto p-3 rounded-3xl border-slate-700 border-2" type="text" id="userId" placeholder="Inserta tu número de usuario" required></input>
        <form onSubmit={handleSubmit} className="flex justify-center w-full">
          <button type="submit" /*onClick={saludar}*/ className="flex bg-blue-300 bg-opacity-30 p-4 mx-auto rounded-3xl text-3xl">Log in</button>
        </form>
        {message && <span className="flex text-3xl">{message}</span>}
        <div className="flex justify-between items-center">
        <div className="flex flex-col gap-4 justify-center">
        <a className="flex bg-blue-300 bg-opacity-30 p-5 m-0 rounded-3xl text-5xl" href="/howtouse">How To Use</a>
        <a className="flex bg-blue-300 bg-opacity-30 p-5 m-0 rounded-3xl text-5xl" href="/pricing">Pricing</a>
        <a className="flex bg-blue-300 bg-opacity-30 p-5 m-0 rounded-3xl text-5xl" href="/contact">Contact</a>
        </div>
        <div>
          <img src="/Logo-CTI-png.png" alt="Logo CTIcontrol" className="h-32 w-auto ml-40" />
        </div>
        </div>
      </main>
    </div>
  );
}

/*
  Importamos la librería useRouter de next/router
  y la declaramos como router
  
  Usamos el hook useState para almacenar el usuarioId

  Uso de encodeURIComponent: Esto sigue siendo importante 
  para asegurar que el nombre del usuario se pase correctamente 
  como parámetro en la URL.
*/