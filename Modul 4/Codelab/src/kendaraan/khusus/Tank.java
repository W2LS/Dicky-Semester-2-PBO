package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.ShootAble;

public class Tank extends Kendaraan implements ShootAble {
    @Override
    public void Start() {
        System.out.println("Menyalakan " + this.getName() + " tank");
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan tank " + this.getName()); //saya menambahkan ;
    }

    @Override
    public void Brake() {
        System.out.println("Tank berhenti"); //saya menambahkan ;
    }

    @Override
    public void Shoot(String vehicle) {
        System.out.println("Tank menembak " + vehicle); //yang semula "+vehi" saya rubah menjadi "+ vehicle"
    }
}
