import java.util.*;
class contact
{
    String name;
    String ph;
    String email;
    contact(String name, String ph, String email)
    {
        this.name= name;
        this.ph= ph;
        this.email= email;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(ph);
        System.out.println(email);
    }
    public static void main(String args[])
    {
        System.out.println("**CONTACT MANAGEMENT SYSTEM**");
        int choice=0;
        Scanner sc=new Scanner(System.in);
        List<contact> newcontact=new ArrayList<>();
        int slNo=1;
        int total=0;
        while(choice!=5)
        {
            System.out.println("1. Add contact.");
            System.out.println("2. View contact.");
            System.out.println("3. Edit existing contact.");
            System.out.println("4. Delete contact.");
            System.out.println("5. Quit.");
            System.out.print("Enter your choice= ");
            choice= sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter the number of contacts you want to add: ");
                    int ar= sc.nextInt();
                    sc.nextLine();
                    for(int i=0;i<ar;i++)
                    {
                        System.out.print("Enter the name= ");
                        String name= sc.nextLine();
                        System.out.print("Enter the phone number= ");
                        String ph= sc.nextLine();
                        System.out.print("Enter the email address= ");
                        String email= sc.nextLine();
                        newcontact.add(new contact(name, ph, email));
                        System.out.println((slNo++) + " contact added.");
                        total++;
                    }
                    break;
                }
                case 2:
                {
                    if(newcontact.isEmpty())
                    {
                        System.out.println("No contact to edit...");
                    }
                    else
                    {
                        System.out.println("All Contacts are as follows :- ");
                        for(int i=0; i<newcontact.size();i++)
                        {
                            System.out.println("Sl No - "+(i+1));
                            newcontact.get(i).display();
                            System.out.println();
                        }
                        System.out.println("Total "+total+" contacts present.");
                        System.out.println();
                    }
                    break;
                }
                case 3:
                {
                    if(newcontact.isEmpty())
                    {
                        System.out.println("No contact to edit...");
                    }
                    else
                    {
                        for(int i=0; i<newcontact.size();i++)
                        {
                            System.out.println("Sl No - "+(i+1));
                            newcontact.get(i).display();
                            System.out.println();
                        }
                        System.out.print("Enter the Sl No of the contact to edit: ");
                        int sl= sc.nextInt();
                        if (sl>=1 && sl<=newcontact.size())
                        {
                            contact Editedcontact = newcontact.get(sl - 1);
                            System.out.println("1. Edit name.");
                            System.out.println("2. Edit phone number.");
                            System.out.println("3. Edit email.");
                            System.out.println("4. Back.");
                            System.out.print("Enter your choice= ");
                            int editchoice;
                            editchoice= sc.nextInt();
                            sc.nextLine();
                            switch(editchoice)
                            {
                                case 1:
                                {
                                    System.out.print("Enter new name= ");
                                    String newname= sc.nextLine();
                                    Editedcontact.name= newname;
                                    System.out.println("Name updated successfully...");
                                    for(int i=0; i<newcontact.size();i++)
                                    {
                                        System.out.println("Sl No - "+(i+1));
                                        newcontact.get(i).display();
                                        System.out.println();
                                    }
                                    break;
                                }
                                case 2:
                                {
                                    System.out.print("Enter new phone number= ");
                                    String newph= sc.nextLine();
                                    Editedcontact.ph= newph;
                                    System.out.println("Phone number updated successfully...");
                                    for(int i=0; i<newcontact.size();i++)
                                    {
                                        System.out.println("Sl No - "+(i+1));
                                        newcontact.get(i).display();
                                        System.out.println();
                                    }
                                    break;
                                }
                                case 3:
                                {
                                    System.out.print("Enter new email= ");
                                    String newemail= sc.nextLine();
                                    Editedcontact.email= newemail;
                                    System.out.println("Email updated successfully...");
                                    for(int i=0; i<newcontact.size();i++)
                                    {
                                        System.out.println("Sl No - "+(i+1));
                                        newcontact.get(i).display();
                                        System.out.println();
                                    }
                                    break;
                                }
                                case 4:
                                {
                                    break;
                                }
                                default:
                                {
                                    System.out.println("Invalid input...");
                                    System.out.println("Please enter a valid input...");
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Invalid index number.");
                            System.out.println("Please enter a valid index number...");
                        }
                    }
                    break;
                }
                case 4:
                {
                    if(newcontact.isEmpty())
                    {
                        System.out.println("No contact to delete...");
                    }
                    else
                    {
                        for(int i=0; i<newcontact.size();i++)
                        {
                            System.out.println("Sl No - "+(i+1));
                            newcontact.get(i).display();
                            System.out.println();
                        }
                        System.out.print("Enter the Sl No of the contact to delete: ");
                        int sl= sc.nextInt();
                        if (sl>=1 && sl<=newcontact.size())
                        {
                            newcontact.remove(sl-1);
                            System.out.println("Contact deleted.");
                        }
                        else
                        {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("Quiting...");
                    break;
                }
                default:
                {
                    System.out.println("Invalid input...");
                    System.out.println("Please enter a valid input...");
                }
            }
        }
    }
}