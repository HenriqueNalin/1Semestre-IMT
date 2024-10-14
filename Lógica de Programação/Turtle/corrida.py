import turtle 
import random 

win = turtle.Screen()
win.title("Corrida das tartarugas")
win.bgcolor("black")
win.setup(width=800, height = 600)

tartarugas = ["Leonardo", "Michelangelo", "Donatello", "Rafael"]
cores = ["Blue", "orange", "purple", "red"]
tartaruga_objects = []

for i in range(len(tartarugas)):
    tartaruga = turtle.Turtle()
    tartaruga.speed(3)
    tartaruga.shape("turtle")
    tartaruga.color(cores[i])
    tartaruga.penup()
    tartaruga.goto(-380, 150 - i * 100)
    tartaruga_objects.append(tartaruga)

vencedor = None
while not vencedor:
    for tartaruga in tartaruga_objects:
        distancia = random.randint(1,10)
        tartaruga.forward(distancia)
        if tartaruga.xcor() >=380:
            vencedor = tartarugas[tartaruga_objects.index(tartaruga)]
            break

mensagem = f"{vencedor} GANHOU A CORRIDA!"
tela_vencedor = turtle.Turtle()
tela_vencedor.speed(0)
tela_vencedor.color("white")
tela_vencedor.penup()
tela_vencedor.hideturtle()
tela_vencedor.goto(0,0)
tela_vencedor.write(mensagem, align="center", font=("Times New Roman", 24, "normal"))

win.exitonclick()