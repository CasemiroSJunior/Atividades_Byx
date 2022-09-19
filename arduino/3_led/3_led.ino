int porta2 = 2;
int porta3 = 3;
int porta4 = 4;
void setup() {
pinMode(porta2,OUTPUT);
pinMode(porta3,OUTPUT);
pinMode(porta4,OUTPUT);

}

void loop() {
digitalWrite(porta2,HIGH);
delay(3000);
digitalWrite(porta2,LOW);
delay(1000);
digitalWrite(porta3,HIGH);
delay(3000);
digitalWrite(porta3,LOW);
delay(1000);
digitalWrite(porta4,HIGH);
delay(3000);
digitalWrite(porta4,LOW);
delay(1000);
}
