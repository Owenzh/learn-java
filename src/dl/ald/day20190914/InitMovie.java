package dl.ald.day20190914;
import java.time.LocalDate;

public class InitMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] acts = {"�Ʋ�","��ˬ"};
		Movie movie = new Movie("ɨ��","����",acts,120.5f,LocalDate.of(2018, 3, 21) );
		movie.doShow("����", 350);
	}

}
