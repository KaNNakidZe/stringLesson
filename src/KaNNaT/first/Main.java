package KaNNaT.first;

public class Main {

    public static void main(String[] args) {
	//
        String phone = "9166841634";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
//            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("������� ������� �������");
        } else if (phone.length() < 10) {
            throw new RuntimeException("������� ������� ��������");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("����� ��� �����������");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79166841634";
        if (phone.equals(expectedPhone)) {
            System.out.println("�����");
        } else {
            System.out.println("�������");
        }
    }
}
