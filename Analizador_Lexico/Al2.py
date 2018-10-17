import sys
fila =1


def tokenize(linea):

    #alfabeto=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C',]
    alfabeto=( map(chr, range(97, 123))) + map(chr, range(65, 91))
    digitos=['0','1','2','3','4','5','6','7','8','9']
    simbolos = ['.', ',', '{', '}', '[', ']', ':', '(', ')', '>', '<', '=', '!', '+', '-', '*', '/', '%', '']
    reservadas = ['in', 'importar', 'retorno', 'end', 'nil', 'desde', 'todo', 'log', 'false', 'true', 'False', 'True',
                  'for', 'funcion', 'if', 'while', 'import', 'else']
    columna = 0
    globaltext=' '
    while columna<len(linea):
        # DETECTA UNA VARIABLE
        if linea[columna] in alfabeto:
            #print"estoy en el alfabeto "+ str(linea[columna]) ' '+ 'col' + str(columna)
            explorador=columna+1
            buffer = str(linea[columna])
            while explorador<len(linea) and (linea[explorador]in alfabeto or linea[explorador] in digitos):
                buffer+=str(linea[explorador])
                explorador+=1
                #print 'encontrado : '+ str(linea[explorador])+' col: '+str(columna)+ ' exp: '+ str(explorador)
            if buffer not in reservadas:
                print '<id'+','+str(buffer)+','+str(fila)+','+str(columna+1)+'>'
            else:
                print'<'+str(buffer)+','+str(fila)+','+str(columna+1)+'>'
            columna= explorador-1


        # DETECTA UN INTEGER Y UN FLOAT
        elif linea[columna] in digitos :
            #print 'soy un digito '+ str(linea[columna])+ ' ' +'col' + str(columna)
            explorador = columna + 1
            puntito= False
            buffer = str(linea[columna])
            while (linea[explorador] in digitos or linea[explorador]=='.') and explorador<len(linea):
                if linea[explorador]== '.': puntito=True
                buffer += str(linea[explorador])
                explorador += 1
            if puntito:
                print '<token_float,'+str(buffer),'+' ,str(fila)+','+str(columna+1)+'>'
            else:
                print '<token_integer,' + str(buffer), '+', str(fila) + ',' + str(columna+1) + '>'
            columna = explorador - 1

         #DETECTA  UN STRING
        elif linea[columna]== "\"" or linea[columna]=="\'":
            #print 'soy una comilla '+ str(linea[columna])+' '+ 'col' + str(columna)
            explorador = columna + 1
            buffer = ''
            while linea[explorador]!="\"" and linea[explorador]!="\'":
                buffer += str(linea[explorador])
                explorador += 1
            print '<token_string,'+str(buffer)+','+str(fila)+','+str(columna+1)+'>'
            columna = explorador
        # {
        elif linea[columna]== "{":
            print '<'+'token_llave_izq'+','+str(fila)+','+str(columna+1)+'>'
        # }
        elif linea[columna] == "}":
            print '<' + 'token_llave_der' + ',' + str(fila) + ',' + str(columna+1) + '>'
        # #
        elif linea[columna] == "#":
           # print '<' + 'token_com' + ',' + str(fila) + ',' + str(columna+1) + '>'
            columna= len(linea)-1
        # [
        elif linea[columna] == "[":
            print '<' + 'token_cor_izq' + ',' + str(fila) + ',' + str(columna+1) + '>'
        # ]
        elif linea[columna] == "]":
            print '<' + 'token_cor_der' + ',' + str(fila) + ',' + str(columna+1) + '>'
        # (
        elif linea[columna] == "(":
            print '<' + 'token_par_izq' + ',' + str(fila) + ',' + str(columna+1) + '>'
        # )
        elif linea[columna] == ")":
            print '<' + 'token_par_der' + ',' + str(fila) + ',' + str(columna+1) + '>'
        # >
        elif linea[columna] == ">":
            #print '<' + 'token_mayor' + ',' + str(fila) + ',' + str(columna+1) + '>'
        # >=
            columna = explorador + 1
            if explorador < len(linea) and linea[explorador] == "=":
                print '<' + 'token_mayor_igual' + ',' + str(fila) + ',' + str(columna + 1) + '>'
                columna = explorador
            else:
                print '<' + 'token_mayor' + ',' + str(fila) + ',' + str(columna + 1) + '>'
                # print '>>>Error lexico(linea:'+str(fila)+', posicion:'+str(columna+1)+')'
                # sys.exit()
        # <
        elif linea[columna]== "<":
            #print '<' + 'token_menor' + ',' + str(fila) + ',' + str(columna+1) + '>'
        #  <=
            columna = explorador + 1
            if explorador < len(linea) and linea[explorador] == "=":
                print '<' + 'token_menor_igual' + ',' + str(fila) + ',' + str(columna + 1) + '>'
                columna = explorador
            else:
                print '<' + 'token_menor' + ',' + str(fila) + ',' + str(columna + 1) + '>'
                # print '>>>Error lexico(linea:'+str(fila)+', posicion:'+str(columna+1)+')'
                # sys.exit()

        #  =
        elif linea[columna] == "=":
            # print '<' + 'token_assign' + ',' + str(fila) + ',' + str(columna+1) + '>'
        # ==
            columna = explorador+1
            if explorador < len(linea) and linea[explorador] == "=":
                print '<' + 'token_igual_num' + ',' + str(fila) + ',' + str(columna + 1) + '>'
                columna=explorador
            else:
                print '<' + 'token_assign' + ',' + str(fila) + ',' + str(columna + 1) + '>'
                # print '>>>Error lexico(linea:'+str(fila)+', posicion:'+str(columna+1)+')'
                # sys.exit()

        # .
        elif linea[columna] == ".":
            print '<' + 'token_point' + ',' + str(fila) + ',' + str(columna+1) + '>'
        elif linea[columna] == ",":
            print '<' + 'token_coma' + ',' + str(fila) + ',' + str(columna+1) + '>'
        elif linea[columna] == ":":
            print '<' + 'token_dosp' + ',' + str(fila) + ',' + str(columna+1) + '>'


        # !
        elif linea[columna] == "!":

        # !=
            columna=explorador+1
            if explorador<len(linea) and  linea[explorador] == "=":
                print '<' + 'token_diff_num' + ',' + str(fila) + ',' + str(columna+1) + '>'
                columna=explorador
            else:
                print '<' + 'token_not' + ',' + str(fila) + ',' + str(columna + 1) + '>'
               # print '>>>Error lexico(linea:'+str(fila)+', posicion:'+str(columna+1)+')'
                #sys.exit()


        # +
        elif linea[columna] == "+":
            print '<' + 'token_mas' + ',' + str(fila) + ',' + str(columna+1) + '>'
        # -
        elif linea[columna] == "-":
            print '<' + 'token_menos' + ',' + str(fila) + ',' + str(columna+1) + '>'
        # *
        elif linea[columna] == "*":
            print '<' + 'token_mul' + ',' + str(fila) + ',' + str(columna+1) + '>'
        # /
        elif linea[columna] == "/":
            print '<' + 'token_div' + ',' + str(fila) + ',' + str(columna+1) + '>'
        # %
        elif linea[columna] == "%":
            print '<' + 'token_mod' + ',' + str(fila) + ',' + str(columna) + '>'
        # ^
        elif linea[columna] == "^":
            print '<' + 'token_pot' + ',' + str(fila) + ',' + str(columna+1) + '>'
        # &&
        elif linea[columna]== "&":
            explorador = columna + 1
            if explorador<len(linea) and linea[explorador]=="&":
                print '<' + 'token_and' + ',' + str(fila) + ',' + str(columna+1) + '>'
                columna=explorador
            else:
                print '>>>Error lexico(linea:' + str(fila) + ', posicion:' + str(columna + 1) + ')'
                sys.exit()

        #||
        elif linea[columna] == "|":
            if explorador<len(linea) and  linea[explorador] == "|":
                print '<' + 'token_or' + ',' + str(fila) + ',' + str(columna+1) + '>'
                columna=explorador
            else:
                print '>>>Error lexico(linea:' + str(fila) + ', posicion:' + str(columna + 1) + ')'
                sys.exit()
        elif linea[columna]== ' ' or linea[columna]== '\n':
            pass
        else:
            #print 'no entiendo  '+ str(linea[columna])+ 'col' + str(columna+1)
            print '>>>Error lexico(linea:'+str(fila)+', posicion:'+str(columna+1)+')'
            sys.exit()
        columna += 1




try:
    file = sys.stdin.readlines()
    for line in file:
        #print line
        tokenize(line)
        fila+=1
except EOFError:
            sys.exit()
