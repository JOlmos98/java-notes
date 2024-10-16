import { Navbar } from "../components";


export default function GeneralLayout({
    children,
  }: Readonly<{
    children: React.ReactNode;
  }>) {
    return (
        <>
        <Navbar />
        <div>
            <h1>
                Esto es el Layout de (general).
                {children}
            </h1>
        </div>
        </>
    );
  }