import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class MemoList {

/*
    int index;
    String name;
    String password;
    String text;
    LocalDateTime date;
    //없어도?
*/

    Memo memo;




    public void memoAdd(int index, String name, String password){
        this.memo.index = index;    //메인에서 +1씩 준다
        this.memo.name = name;
        memo.password = password;
        Scanner sc = new Scanner(System.in);
        System.out.println("메모를 입력해주세요 : ");
        memo.text = sc.next();

        //작성일
        memo.date = LocalDateTime.now();

    }









    public void memoEdit(int index,List<MemoList> arr){


        if(arr.size()<=index){
            System.out.println("수정할 글이 존재하지 않습니다");
        }else{
            int sel=0;
            for(MemoList list : arr){
                if(list.memo.index==index){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("비밀번호를 입력해주세요 ");
                    String pw = sc.next();
                    if(list.memo.password.equals(pw)){
                        System.out.println("수정할 내용을 입력해주세요 ");
                        String txt = sc.next();
                        list.memo.text = txt;   //잘못된코드? 직접접근

                        //수정일 변경
                        memo.date = LocalDateTime.now();
                    }else{
                        System.out.println("비밀번호가 올바르지 않습니다");
                        return;
                    }

                }else{
                    sel++;
                }
            }
        }


    }

    public void memoDel(int index,List<MemoList> arr){


        if(arr.size()<=index){
            System.out.println("삭제할 글이 존재하지 않습니다");
        }else{
            int sel=0;
            //글의 수정 또는 삭제 시 글 번호를 넘겨 받고 리스트에서 글 번호에 해당하는  글 1건을 얻어와 리턴 시키는 메소드가 있다. 분리필요함
            for(MemoList list : arr){
                if(list.memo.index==index){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("비밀번호를 입력해주세요 ");
                    String pw = sc.next();
                    if(list.memo.password.equals(pw)){
                        System.out.println("삭제할 내용을 입력해주세요 ");
                        String txt = sc.next();
                        arr.remove(sel);
                    }else{
                        System.out.println("비밀번호가 올바르지 않습니다");
                        return;
                    }

                }else{
                    sel++;
                }
            }
        }


    }

    public void memoList(List<MemoList> arr){

        for(MemoList list : arr){   //수정-역순출력해야함
            System.out.println(list.memo.index + "번째 메모 = " + list.memo.text + "\n");
        }




    }









    public int getIndex() {
        return memo.index;
    }

    public void setIndex(int index) {
        this.memo.index = index;
    }

    public String getName() {
        return memo.name;
    }

    public void setName(String name) {
        this.memo.name = name;
    }

    public String getPassword() {
        return memo.password;
    }

    public void setPassword(String password) {
        this.memo.password = password;
    }

    public String getText() {
        return memo.text;
    }

    public void setText(String text) {
        this.memo.text = text;
    }

    public LocalDateTime getDate() {
        return memo.date;
    }

    public void setDate(LocalDateTime date) {
        this.memo.date = date;
    }


}
