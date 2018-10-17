import sys
fila =1
nav=0
toparser = []
simbolos = {'token_llave_izq': '{', 'token_llave_der': '}', 'token_cor_izq': '[', 'token_cor_der': ']',
            'token_par_izq': '(', 'token_par_der': ')', 'token_mayor': '>', 'token_menor': '<',
            'token_mayor_igual': '>=',
            'token_menor_igual': '<=', 'token_igual_num': '==', 'token_point': '.', 'token_diff_num': '!=',
            'token_and': '&&', 'token_or': '||', 'token_not': '!', 'token_mas': '+', 'token_menos': '-',
            'token_mul': '*', 'token_div': '/',
            'token_mod': '%', 'token_pot': '^', 'token_assign': '=', 'token_coma': ',', 'token_point': '.',
            'token_dosp': ':', 'in': 'in', 'importar': 'importar', 'retorno': 'retorno', 'end': 'end', 'nil': 'nil',
            'desde': 'desde', 'todo': 'todo', 'log': 'log', 'false': 'false', 'true': 'true', 'for': 'for',
            'funcion': 'funcion', 'if': 'if', 'while': 'while',
            'else': 'else'}
def tostr(arr):
    temp=''
    for x in arr:
        temp+= str(x)
    print temp
def translate(token):
    return simbolos.get(token)
def importar(line,nav):
    if line[nav]== 'id'and line[nav+1]=='token_point':
        nav+=2
        importar(line,nav)
        print nav





def llaves(caso):#1:viene de ],2viene de ),3 viene de =
    if caso==1:
        pass

def inicio(line, nav):
    initializer = ['importar', 'for', 'if', 'while', 'log']
    if line[0] not in initializer:
        bf = ['<', fila, ':', nav + 1, '> ', 'Error Sintactico. Encontrado:\' ', translate(line[0]),
              '\' esperado expresion']
        print tostr(bf)
        nav += 1
    else:
        if line[nav] == initializer[0]:
            nav += 1
            importar(line,nav)
            print 'tachan'
        if line[nav] == initializer[1]:
            pass
        if line[nav]== initializer[2]:
            pass
        if line[nav] == initializer[3]:
            pass
        if line[nav] == initializer[4]:
            pass


def parse(line):

    llaves=0
    parentesis=0
    cuadradas=0
    while nav <len(line):
        inicio(line,nav)











def tokenize(linea):

    #alfabeto=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C',]
    alfabeto=( map(chr, range(97, 123))) + map(chr, range(65, 91))
    digitos=['0','1','2','3','4','5','6','7','8','9']
    simbolos=['.', ',','{','}','[',']',':','(',')','>','<','=','!','+','-','*','/','%','']
    reservadas=['in','importar','retorno','end','nil','desde','todo','log', 'false','true','for','funcion', 'if','while', 'import', 'else']
    columna = 0

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
                bf= ['<','id',',',str(buffer),',',str(fila),','+str(columna+1),'>']
                tostr(bf)
                toparser.append(bf[1])
            else:
                bf=['<',str(buffer),','+str(fila),','+str(columna+1),'>']
                tostr(bf)
                toparser.append(bf[1])
            columna= explorador-1


        # DETECTA UN INTEGER Y UN FLOAT
        elif linea[columna] in digitos :
            #print 'soy un digito '+ str(linea[columna])+ ' ' +'col' + str(columna)
            explorador = columna + 1
            puntito= False
            buffer = str(linea[columna])
            #print explorador
            if explorador<len(linea):
                while linea[explorador] in digitos or linea[explorador]=='.' :
                    if linea[explorador]== '.': puntito=True
                    #print str(explorador) + ' ' + str(columna)+ str(len(linea))
                    buffer += str(linea[explorador])
                    if  explorador+1==len(linea):
                        explorador += 1
                        break
                    explorador+=1


            if puntito:
                bf=[ '<','token_float,', str(buffer),',', str(fila),',', str(columna+1),'>']
                tostr(bf)
                toparser.append(bf[1])
            else:
                bf= ['<','token_integer,' , str(buffer)+',' , str(fila) , ',' , str(columna+1) , '>']
                tostr(bf)
                toparser.append(bf[1])
            if explorador!=len(line):
                columna = explorador-1
            else:
                columna = explorador

         #DETECTA  UN STRING
        elif linea[columna]== "\"" or linea[columna]=="\'":
            #print 'soy una comilla '+ str(linea[columna])+' '+ 'col' + str(columna)
            explorador = columna + 1
            buffer = ''
            while linea[explorador]!="\"" and linea[explorador]!="\'":
                buffer += str(linea[explorador])
                explorador += 1
            print ['<','token_string,',str(buffer),',',str(fila),',',str(columna+1),'>']
            tostr(bf)
            toparser.append(bf[1])
            columna = explorador



        # {
        elif linea[columna]== "{":
            bf= ['<','token_llave_izq',',',str(fila),',',str(columna+1),'>']
            tostr(bf)
            toparser.append(bf[1])
        #:
        elif linea[columna]== ":":
            bf=[ '<','token_dosp',',',str(fila),',',str(columna+1),'>']
            tostr(bf)
            toparser.append(bf[1])
        # }
        elif linea[columna] == "}":
            bf=['<' , 'token_llave_der' , ',' , str(fila) , ',' , str(columna+1) , '>']
            tostr(bf)
            toparser.append(bf[1])
        # #
        elif linea[columna] == "#":
           # print '<' + 'token_com' + ',' + str(fila) + ',' + str(columna+1) + '>'
            columna= len(linea)-1


        # [
        elif linea[columna] == "[":
            bf=['<' , 'token_cor_izq' , ',' , str(fila) , ',' , str(columna+1) , '>']
            tostr(bf)
            toparser.append(bf[1])

        # ]
        elif linea[columna] == "]":
            bf=['<' , 'token_cor_der' , ',' , str(fila) , ',' , str(columna+1) , '>']
            tostr(bf)
            toparser.append(bf[1])
        # (
        elif linea[columna] == "(":
            bf=['<' , 'token_par_izq' , ',' , str(fila) , ',' , str(columna+1) , '>']
            tostr(bf)
            toparser.append(bf[1])
        # )
        elif linea[columna] == ")":
            bf=['<' , 'token_par_der' , ',' , str(fila) , ',' , str(columna+1) , '>']
            tostr(bf)
            toparser.append(bf[1])
        # >
        elif linea[columna] == ">":
            #print '<' + 'token_mayor' + ',' + str(fila) + ',' + str(columna+1) + '>'

        # >=
            explorador = columna + 1
            if explorador < len(linea):
                if linea[explorador] == "=":
                    bf=['<' , 'token_mayor_igual' , ',' , str(fila) , ',' , str(columna + 1) , '>']
                    tostr(bf)
                    toparser.append(bf[1])
                    columna=explorador
                else:
                    bf=['<' , 'token_mayor' , ',' , str(fila) , ',' , str(columna + 1) , '>']
                    tostr(bf)
                    toparser.append(bf[1])


        # <
        elif linea[columna]== "<":
            #print '<' + 'token_menor' + ',' + str(fila) + ',' + str(columna+1) + '>'
        #  <=
            explorador = columna + 1
            if explorador < len(linea):
                if linea[explorador] == "=":
                    bf=['<' , 'token_menor_igual' , ',' , str(fila) , ',' , str(columna + 1) , '>']
                    tostr(bf)
                    toparser.append(bf[1])
                    columna = explorador
                else:
                    bf=['<' , 'token_menor' , ',' , str(fila) , ',' , str(columna + 1) , '>']
                    tostr(bf)
                    toparser.append(bf[1])



        #  =
        elif linea[columna] == "=":
        # ==
            explorador = columna + 1
            if explorador<len(linea) and (linea[explorador] == "=" ) :
                bf=['<' , 'token_igual_num' , ',' , str(fila) , ',' , str(columna+1) , '>']
                tostr(bf)
                toparser.append(bf[1])
                columna=explorador
            else:
                bf=['<' , 'token_assign' , ',' , str(fila) , ',' , str(columna + 1) , '>']
                tostr(bf)
                toparser.append(bf[1])

        # .
        elif linea[columna] == ".":
            bf=['<' , 'token_point' , ',' , str(fila) , ',' , str(columna+1) , '>']
            tostr(bf)
            toparser.append(bf[1])
        #,
        elif linea[columna] == ",":
            bf=['<' , 'token_coma' , ',' , str(fila) , ',' , str(columna+1) , '>']
            tostr(bf)
            toparser.append(bf[1])

        # !
        elif linea[columna] == "!":
           # print '<' + 'token_not' + ',' + str(fila) + ',' + str(columna+1) + '>'
        # !=
           explorador = columna + 1
           if explorador < len(linea):
               if linea[explorador] == "=":
                   bf=['<' , 'token_diff_num' , ',' , str(fila) , ',' , str(columna + 1) , '>']
                   tostr(bf)
                   toparser.append(bf[1])
                   columna = explorador
               else:
                   bf=['<' , 'token_not' , ',' , str(fila) , ',' , str(columna + 1) , '>']
                   tostr(bf)
                   toparser.append(bf[1])




        # +
        elif linea[columna] == "+":
            bf=['<' + 'token_mas' + ',' + str(fila) + ',' + str(columna+1) + '>']
            tostr(bf)
            toparser.append(bf[1])
        # -
        elif linea[columna] == "-":
            bf = ['<' , 'token_menos' , ',' , str(fila) , ',' , str(columna+1) , '>']
            tostr(bf)
            toparser.append(bf[1])
        # *
        elif linea[columna] == "*":
            bf = ['<' , 'token_mul' , ',' , str(fila) , ',' , str(columna+1) , '>']
            tostr(bf)
            toparser.append(bf[1])
        # /
        elif linea[columna] == "/":
            bf = ['<' , 'token_div' , ',' , str(fila) , ',' , str(columna+1) , '>']
            tostr(bf)
            toparser.append(bf[1])
        # %
        elif linea[columna] == "%":
            bf = ['<' , 'token_mod' , ',' , str(fila) , ',' , str(columna+1) , '>']
            tostr(bf)
            toparser.append(bf[1])
        # ^
        elif linea[columna] == "^":
            bf = ['<' , 'token_pot' , ',' , str(fila) , ',' , str(columna+1) , '>']
            tostr(bf)
            toparser.append(bf[1])
        # &&
        elif linea[columna]== "&":
            explorador = columna + 1
            if explorador<len(linea) and linea[explorador]=="&":
                bf = ['<' , 'token_and' , ',' , str(fila) , ',' , str(columna+1) , '>']
                tostr(bf)
                toparser.append(bf[1])
                columna=explorador
            else:
                print '>>> Error lexico(linea:'+str(fila)+',posicion:'+str(columna+1)+')'
                sys.exit()

        #||
        elif linea[columna] == "|":
            explorador = columna + 1
            if explorador<len(linea) and  linea[explorador] == "|":
                bf = ['<' , 'token_or' , ',' , str(fila) , ',' , str(columna+1) , '>']
                tostr(bf)
                toparser.append(bf[1])
                columna=explorador
            else:
                print '>>> Error lexico(linea:' + str(fila) + ',posicion:' + str(columna + 1) + ')'
                sys.exit()
        elif linea[columna]== ' ' or linea[columna]== '\n' or linea[columna]== ''or  linea[columna]== '\r\n'or linea[columna]== '\r':
            if linea[columna]== '\n':toparser.append(str('endl'))
            pass
        else:
            #print 'no entiendo  '+ str(linea[columna])+ 'col' + str(columna+1)
            print '>>> Error lexico(linea:' + str(fila) + ',posicion:' + str(columna + 1) + ')'+ repr(linea[columna])
            sys.exit()
        columna += 1







try:
    file = open('input.txt','r')
    for line in file:
        #print repr(line)
        tokenize(line)
        fila+=1
    print toparser
    parse(toparser)
except EOFError:
            sys.exit()
"""
try:

    file = sys.stdin.readlines()
    for line in file:
        #print line
        tokenize(line)
        fila+=1
except EOFError:
            sys.exit()

"""