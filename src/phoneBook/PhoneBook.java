import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook implements Comparator<Contact>{
	
	private ArrayList<Contact> phoneBook = new ArrayList<Contact>();
	private ArrayList<String> output = new ArrayList<String>();
	int[] rm;
	public static void main(String[] args) {
		ArrayList<Integer> rm = new ArrayList<Integer>();
		ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
		String input = "Charlie,Zoe,08123123123;Andre,Xavier,08111222333;Charlie,Xyz,08123123123;Jean,Summers,08001001001";
		String[] str = input.split(";");
		PhoneBook pb = new PhoneBook();
		System.out.println("Output:\r\n" + 
				"=== Output START ===\r\n" + 
				"Log:");
		for(int i = 0; str.length > i; i++) {
			arr.add(new ArrayList<String>());
			String message="";
			String[] stp = str[i].split(",");
			int fn=0;
			int ln=0;
			int nm=0;
			for(int j = 0; stp.length > j; j++) {
				arr.get(i).add(stp[j]);
				if(j==1) {
					ln=j;
				}else if(j==2) {
					nm=j;
				}else {
					fn=j;
				}
			}
			boolean checkNumber;
			if(checkNumber = pb.checkNumber(arr.get(i).get(nm))) {
				message = " : duplicate phone number";
			}else {
				message = " : insert success";
			}
			
			pb.add(arr.get(i).get(fn), arr.get(i).get(ln), arr.get(i).get(nm));
			if(checkNumber) {
				Contact searchContact = new Contact(pb.phoneBook.get(i).getFirstName(), pb.phoneBook.get(i).getLastName(), pb.phoneBook.get(i).getNumber());
				int search = Collections.binarySearch(pb.phoneBook, searchContact, new CobaArrayList());
				rm.add(search);
			}
			
			System.out.println(pb.phoneBook.get(i).getFirstName() + " " + pb.phoneBook.get(i).getLastName() + " - " + pb.phoneBook.get(i).getNumber() + message);
			
		}
		
		for(int i =0; rm.size() > i; i++) {
			pb.phoneBook.remove(rm.get(i).intValue());
		}
		
		System.out.println();
		System.out.println("Phone book:");
		pb.sortContact();
	}
	
	public void sortContact() {
		int num = 1;
		for(Contact contact : this.phoneBook) {
			output.add(contact.getFirstName() + " " + contact.getLastName() +  " - " + contact.getNumber());
		}
		Collections.sort(output);
		for(String s:output) {
			System.out.println(num + ". " + s);
			num++;
		}
	}
	
	public void add(String firstName, String lastName, String number) {
		Contact contact = new Contact(firstName, lastName, number);
		this.phoneBook.add(contact);
	}
	
	public boolean checkNumber(String number) {
		for(Contact contact : this.phoneBook) {
			return contact.getNumber().equals(number);
		}
		return false;
	}

	@Override
	public int compare(Contact o1, Contact o2) {
		if(o1.getNumber().equals(o2.getNumber())){
            return 0;
        } else {
            return -1;
        }
	}
}
