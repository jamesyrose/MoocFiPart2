package Part8;

public class IOUmain {

	public static void main(String[] args) {
		IOU mattsIOU = new IOU();
		mattsIOU.setSum("Arthur", 51.5);
		mattsIOU.setSum("Michael", 30);

		System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
		System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
		mattsIOU.setSum("Arthur", 10.5);
		System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));


	}

}
