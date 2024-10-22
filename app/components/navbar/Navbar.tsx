import { HomeIcon } from "@primer/octicons-react"
import Link from "next/link"

const navItems=[
    {path: '/howtouse', text: 'How to use'},
    {path: '/pricing', text: 'Pricing'},
    {path: '/contact', text: 'Contact'}
]



export const Navbar=()=>{

    //console.log('Creamos el navbar, esto, como se ejcuta del lado del servidor, \naparecerá al arrancar la aplicación, en la consola, y no en la consola de la web (cliente).')

    return (
        <nav className="flex bg-blue-300 bg-opacity-30 p-2 m-2 rounded">
            <Link href={'/'} className="flex items-center">
                <HomeIcon className="mr-2"/>
                <span>Home</span>
            </Link>
            

            <div className="flex flex-1"></div>

            {
                navItems.map( navItem => (
                    <Link key={navItem.path} className="mr-2" href={navItem.path}>{navItem.text}</Link>
                ))
            }

        </nav>
    )
}