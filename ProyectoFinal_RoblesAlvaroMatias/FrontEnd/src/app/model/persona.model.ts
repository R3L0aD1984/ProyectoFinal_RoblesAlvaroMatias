export class persona{
    id?: number;
    apellido: String;
    nombre: String;
    img: String;

    constructor(apellido: String, nombre: String, img: String){
        this.apellido = apellido;
        this.nombre = nombre;
        this.img = img;
    }
}