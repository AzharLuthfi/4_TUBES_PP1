package projectKRS;

public class KartuRencanaStudi {
	 private String mataKuliah;
	    private int sks;
	    private int semester;
	    private String jadwal;

	    public KartuRencanaStudi(String mataKuliah, int sks, int semester, String jadwal) {
	        this.mataKuliah = mataKuliah;
	        this.sks = sks;
	        this.semester = semester;
	        this.jadwal = jadwal;
	    }

	    public String getMataKuliah() {
	        return mataKuliah;
	    }

	    public void setMataKuliah(String mataKuliah) {
	        this.mataKuliah = mataKuliah;
	    }

	    public int getSks() {
	        return sks;
	    }

	    public void setSks(int sks) {
	        this.sks = sks;
	    }

	    public int getSemester() {
	        return semester;
	    }

	    public void setSemester(int semester) {
	        this.semester = semester;
	    }

	    public String getJadwal() {
	        return jadwal;
	    }

	    public void setJadwal(String jadwal) {
	        this.jadwal = jadwal;
	    }
}
