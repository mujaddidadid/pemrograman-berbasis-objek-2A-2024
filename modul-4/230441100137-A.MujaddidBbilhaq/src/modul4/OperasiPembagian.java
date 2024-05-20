package modul4;

public class OperasiPembagian extends OperasiBilanganAbs {
    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C() {
        if (this.b == 0) {
            throw new IllegalArgumentException("Bilangan B tidak boleh nol.");
        }
        this.c = this.a / this.b;
    }

    @Override
    protected double get_A() {
        return this.a;
    }

    @Override
    protected double get_B() {
        return this.b;
    }

    @Override
    protected double get_C() {
        return this.c;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Operasi Pembagian: " + this.a + " / " + this.b + " = " + this.c);
    }
    
}