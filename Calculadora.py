class Calculadora:
    def __init__(self):
        self.carga = 0
        self.inicio = init
        self.soma = 0
        

    def re(self, qtd):
        self.carga += qtd
        if(self.carga > self.inicio):
            self.carga = self.inicio

    def soma(self,numa,numb):
        #numa=int(raw_input(" digite um numero : "))
        #numb=int(raw_input(" digite outro numero : "))
        #self.soma = numa + numb
        
        


    def __str__(self):
        return "battery = "+ str (self.carga)
init=int(raw_input(" Digite a carga inicial: "))

calculadora= Calculadora()
linha = ""
print ("Digite charge para recaregar a bateria, show ou end ")
while (linha != "end"):
    
    linha= raw_input()
    us = linha.split(" ")
    if us[0] == "end":
        break
    elif us[0] == "show":
        print (calculadora)
    elif us[0]== "charge":
        calculadora.re(int(us[1]))
    elif us[0] == "soma":
        calc.somar(int(ui[1]), (ui[2])
                   print calc.somar
        
        


        
        
