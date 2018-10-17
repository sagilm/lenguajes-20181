import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	public static String token(String str){
		
		if (str.equals("{")) return "token_llave_izq";
		if (str.equals("}")) return "token_llave_der"; 
		if (str.equals("#")) return "token_com";
		if (str.equals("[")) return "token_cor_izq";
		if (str.equals("]")) return "token_cor_der";	
		if (str.equals("(")) return "token_par_izq";
		if (str.equals(")")) return "token_par_der";
		//if (str.equals(">")) return "token_mayor";
		//if (str.equals("<")) return "token_menor";
		if (str.equals(">=")) return "token_mayor_igual";
		if (str.equals("<=")) return "token_menor_igual";
		if (str.equals(" in ")) return "token_in";
		if (str.equals("==")) return "token_igual_num";
		if (str.equals(".")) return "token_point";
		if (str.equals("!=")) return "token_diff_num";
		if (str.equals("&&")) return "token_and";
		if (str.equals("||")) return "token_or";
		//if (str.equals("!")) return "token_not";
		if (str.equals("*")) return "token_mas";
		if (str.equals("-")) return "token_menos";
		if (str.equals("*")) return "token_mul";
		if (str.equals("/")) return "token_div";
		if (str.equals("%")) return "token_mod";
		if (str.equals("^")) return "token_pot";
		return "N";
		
	}
	public static String tokenSpecial(String str){
		

		if (str.equals(">")) return "token_mayor";
		if (str.equals("<")) return "token_menor";
		if (str.equals("!")) return "token_not";

		return "N";
	}
	
	public static String tokenDoble(String str){
		
		if (str.equals("=")) return "token_igual_num";
		if (str.equals("&")) return "token_and";
		if (str.equals("|")) return "token_or";

	return "N";		
	}

	public static void main(String[] args) {
				

		
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		
		Queue<String> cola=new LinkedList(); //cola de letras de la linea leida acutalmente
		Queue<String> cola2=new LinkedList();
		for(int i=0; i<str.length(); i++){  // se llena la cola
			cola.add(str.substring(i,i+1));
		}
		cola.add(" ");
		//recorre caracter a caracter mientras la cola tenga elementos
		String s= cola.poll();
		while(!cola.isEmpty()){
		
			String st="";
			// lee cadenas entre comillas
			if(s.equals("\"")){ 
				st=st+s;
				s= cola.poll();
				while(!s.equals("\"") && !cola.isEmpty()){
					st=st+s;
					s=cola.poll();
				}
				st=st+s;
				cola2.add(st);

				if(!cola.isEmpty()){ 
					s=cola.poll();
				}else{
					continue;
				}
			}
			if(s.equals("\"")){
				continue;
			}
			
			//detecta caracteres declarados en al funcion token
			if(!token(s).equals("N")){
				cola2.add(s);
			}else{
				if(!tokenSpecial(s).equals("N")){
					if(!cola.isEmpty()){
						st=cola.poll();
						st=s+st;
						if(!token(st).equals("N")){
							cola2.add(st);
						}else{
							cola2.add(s);
						}
					}
					
				}else{
					//detecta token dobles como: && || ==
					if(!tokenDoble(s).equals("N") && !cola.isEmpty()){
						
						st= cola.peek(); //revisar 
						st=s+st;
						if(!token(st).equals("N")){
							cola2.add(st);
							cola.poll(); //prueba
						}else{
							cola2.add(s);
						}
					}else{ //prueba
						cola2.add(s);
					}
				}
			}

			s= cola.poll();
			
		}
		cola2.add(" ");
		System.out.println("cola2 "+cola2);
		
		//palabras y/o numeros
		Queue<String> cola3=new LinkedList();
		s= cola2.poll();
		while(!cola2.isEmpty()){
			
			 
			if(s.startsWith("\"")){ // pasa las "" a la cola 3
				cola3.add(s); 
				s=cola2.poll();
			}
			if(s.equals(" ")){
				cola3.add(s);
				s=cola2.poll();
			}
			
			Queue<String> tem=new LinkedList();
			if(!cola2.isEmpty()){
				char ch = s.charAt(0); 
				int ascii = (int) ch; 
				
				if((token(s).equals("N") && tokenSpecial(s).equals("N"))){
					String st="";
					while(token(s).equals("N") && tokenSpecial(s).equals("N") && !s.equals(" ") && !s.startsWith("\"")){
						ch = s.charAt(0); 
						ascii = (int) ch; 
						//pasaplabras y/o numeros
						if((ascii >=48 && ascii<=57) || (ascii>=64 && ascii<=90) || (ascii>=97 && ascii<=122)){
							st=st+s;
						}else{
							tem.add(s);
							//cola3.add(s); 
						}
						if(cola2.isEmpty()){
							break;
							
						}else{
							s=cola2.poll();
						}
					}
					if(!st.equals("")){
						
						cola3.add(st);
					}
					while(!tem.isEmpty()){
						cola3.add(tem.poll());
					}
				}else{
					
					cola3.add(s);
					s=cola2.poll();
				}
			}
		}
		System.out.println("cola3 "+ cola3);
		
		Queue<String> cola4=new LinkedList();
		cola3.add("");
		s= cola3.poll();
		
		while(!cola3.isEmpty()){

			if (s.equals(" ")){
				cola4.add(s);
				s=cola3.poll();
			}
			
			if((!token(s).equals("N") || !tokenSpecial(s).equals("N")) && (!s.startsWith("\"")) ){
				cola4.add(s);
				s= cola3.poll();
				
			}else{
				if(s.startsWith("\"") || s.startsWith("\"")){ // pasa las "" a la cola 4
					cola4.add(s);
					s= cola3.poll();
				}
				if(s.length()<=1){ // agrega simbolos no definidos
					cola4.add(s);
					s= cola3.poll();
				}else{
					s=s+"";
					int i=0;
					
					char ch = s.charAt(0); 
					int v = (int) ch;
					while(i<s.length()){
						
						String st="";

						while((v<58 && v>47) && i<s .length()){
							ch = s.charAt(i);
							v = (int) ch;
							if((v<58 && v>47)){
								st=st+ch;
								i++;
							}
						}
						if(!st.equals("")){
							cola4.add(st);
						}
						st="";
						while(((v<123 && v>96) || (v<91 && v>64)) && i<s.length()){
							ch = s.charAt(i);
							v = (int) ch;
							if(((v<123 && v>96) || (v<91 && v>64))){
								st=st+ch;
								i++;
							}
						}
						if(!st.equals("")){
							cola4.add(st);
						}
					}
					s= cola3.poll();
				}
			}
		}
		System.out.println("cola4 "+ cola4);
		
	}

	

}

