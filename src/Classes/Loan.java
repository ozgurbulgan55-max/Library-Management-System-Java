package Classes;

import java.time.LocalDate;

public class Loan {
	
    private book book;
    private Member member;
    private LocalDate loanDate;
    private LocalDate dueDate;
	
    public Loan(book book,Member member) {
    	this.book=book;
    	this.member=member;
    	this.loanDate=loanDate.now();
    	this.dueDate = loanDate.plusDays(15); 
    }
    public book getBook() {
    	return book;
    }
    public Member getMember() {
    	return member;
    }
    public LocalDate getLoandate() {
    	return loanDate;
    }
    public LocalDate getDueDate() {
    	return dueDate;
    }
    public String toString() {
    	return "Ödünç Bilgisi:" +
                "\nKitap: " + book.KitapAdi() +
                "\nÜye: " + member.getMemberNo() +
                "\nAlınma Tarihi: " + loanDate +
                "\nTeslim Tarihi: " + dueDate;
    }
}
