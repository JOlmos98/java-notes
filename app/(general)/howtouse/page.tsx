import type { Metadata } from "next";




export const metadata: Metadata = {
 title: 'About JOS',
 description: 'Página HowToUSe',
 creator: 'JOS',
 keywords: ['jesús', 'portfolio', 'about me', 'sobre mí']
};

export default function AboutPage(){
    return (
        <div className="grid grid-rows-[20px_1fr_20px] items-center justify-items-center min-h-screen p-8 pb-20 gap-16 sm:p-20 font-[family-name:var(--font-geist-sans)]">
        <main className="flex flex-col gap-8 row-start-2 items-center sm:items-start">
          <span className="text-4xl">Aquí iría una breve guía sobre el uso del software, modificación de los parámetros, qué hace cada uno, etcétera, un README más reducido y simplificado.
          </span>
        </main>
        <footer className="row-start-3 flex gap-6 flex-wrap items-center justify-center">
          <p>Borramos el footer.</p>
        </footer>
      </div>
    )
}