int led =2;
int botao =5;
int botao_press=0;
void setup() {
pinMode(led,OUTPUT);
pinMode(botao,INPUT);

}

void loop() {
  botao_press = digitalRead(botao);
if ( botao_press == HIGH){
  digitalWrite(led,HIGH);
  }
  else{
    digitalWrite(led,LOW);
    }
}
