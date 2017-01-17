class CollectionList{
  public static void main(String[] args){
     void arrayList(){
      ArrayList<String> list = new ArrayList<String>();
      String[] buah = new String[]{"anggur","jeruk","strawberry"};
      
      list.addAll(Arrays.asList(buah));
      
      Iterator isi = list.iterator();
      
      while(isi.hasNext()){   //memeriksa apakah list mempunyai nilai
        System.out.println(isi.next()); //mencetak nilai dari arraylist
      }
  }
}
