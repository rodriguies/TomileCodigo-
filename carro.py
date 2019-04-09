class Car:
    def __init__(self):
        self.pas= 0
        self.km= 0
        self.gas= 0
        self.lim_pas = 2
        self.lim_gas = 10

    def entrar(self):
        
        if self.pas < self.lim_pas:
            self.pas +=1
        else:
            print("fail: limite de pessoas atingido")
        
    def tirar(self):
        if self.pas > 0:
            self.pas -=1
        else:
            print("fail:não ah ninguem no carro ")

    def abastecer(self,qtd):
        self.gas += qtd
        if(self.gas > self.lim_gas):
            self.gas = self.lim_gas

    def drive(self, distancia):
        if self.pas ==0:
            print("fail: nao ah ninguem no carro ")
            return
        gas_nece= distancia /10
        if (self.gas >= gas_nece):
            self.km += distancia
            self.gas -= gas_nece
        else:
            print("fail: gasolina insuficiente")



            
    def __str__(self):
        return "pass:" + str(self.pas) + ", gas:" + str(self.gas) + ", km:" + str(self .km)


carro= Car()
linha = ""
print("Digite show, entrar, out, gas _qtd, drive _dist ou end:")
while(linha != "end"):
    linha = raw_input()
    usuario = linha.split(" ")
    if usuario[0]== "end":
        break
    elif usuario[0] == "show":
        print (carro)
    elif usuario[0]== "entrar":
        carro.entrar()
    elif usuario[0]== "out":
        carro.tirar()
    elif usuario[0]== "gas":
        carro.abastecer(int (usuario[1]))
    elif usuario[0] == "drive":
        carro.drive(int(usuario[1]))
    else:
        print("comando invalido")
  
