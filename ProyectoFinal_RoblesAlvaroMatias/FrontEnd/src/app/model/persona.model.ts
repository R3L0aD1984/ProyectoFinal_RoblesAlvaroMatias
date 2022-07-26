export class persona{
    id?: number;
    apellido: string;
    nombre: string;
    img: string;

    constructor(apellido: string, nombre: string, img: string){
        this.apellido = apellido;
        this.nombre = nombre;
        this.img = img;
    }
}