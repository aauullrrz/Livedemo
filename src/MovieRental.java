/**
 *  Kelas MovieRental merepresentasikan transaksi penyewaan film,
 *  menyimpan informasi tentang judul film, durasi penyewaan dalam hari,
 *  dan harga sewa harian. Kelas ini menyediakan metode untuk menghitung
 *  total biaya sewa dan menampilkan detail penyewaan.
 */
class MovieRental implements IMovieRental {
    private String movieTitle;
    private int rentalDays;
    private double pricePerDay;

    /**
     *
     * @param movieTitle judul dari film
     * @param rentalDays jumlah hari penyewaan film
     * @param pricePerDay harga sewa per hari
     */
    public MovieRental(String movieTitle, int rentalDays, double pricePerDay) {
        this.setMovieTitle(movieTitle);
        this.setRentalDays(rentalDays);
        this.setPricePerDay(pricePerDay);
    }

    /**
     *
     * @return total biaya sewa
     */
    public double calculateSubtotal() {
        return (double)this.getRentalDays() * this.getPricePerDay();
    }

    /**
     * menampilkan informasi penyewaan (judul,durasi,tarif harian
     * dan total biaya)
     */
    public void displayRentalInfo() {
        System.out.println("Movie Title: " + this.getMovieTitle());
        System.out.println("Rental Duration (Days): " + this.getRentalDays());
        System.out.println("Daily Rate: $" + this.getPricePerDay());
        System.out.println("Total Rental Cost: $" + this.calculateSubtotal());
    }

    /**
     * mengambil judul film
     * @return judul film
     */
    public String getMovieTitle() {
        return this.movieTitle;
    }

    /**
     * untuk menetapkan judul film
     * @param movieTitle judul film
     */
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    /**
     * mengambil jumlah hari sewa
     * @return jumlah hari sewa
     */
    public int getRentalDays() {
        return this.rentalDays;
    }

    /**
     * menetapkan durasi sewa
     * @param rentalDays jumlah hari penyewaan film
     */
    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    /**
     * mengambil harga sewa
     * @return harga sewa /hari
     */
    public double getPricePerDay() {
        return this.pricePerDay;
    }

    /**
     * menetapkan harga sewaa /hari
     * @param pricePerDay harga sewa harian
     */
    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
