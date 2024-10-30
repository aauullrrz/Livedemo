/**
 * interface IMovieRental mendefinisikan implementasi untuk kelas yang
 * merepresentasikan penyewaan film. Antarmuka ini menyediakan
 * metode untuk menghitung total biaya sewa dan menampilkan
 * informasi penyewaan
 */
public interface IMovieRental {
    /**
     * Menghitung total biaya sewa berdasarkan durasi dan tarif sewa.
     * @return subtotal biaya sewa
     */
    double calculateSubtotal();

    /**
     * Menampilkan informasi penyewaan, termasuk detail film, durasi
     * penyewaan, tarif hafrian, dan total biaya sewa
     */
    void displayRentalInfo();
}
