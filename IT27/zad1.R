x<-c(87, 87,93,99,103,105,119,129,130,132,138,145,145,145,152,153,160,180,195,211)
#a) meidjana,modus

Me<-median(x);Me

tx<-table(x);tx
Mo<-as.numeric(names(tx)[which.max(tx)]);Mo

#b) aritmeticka asredina i strandardna divijacija 
xn<-mean(x);xn
n<-length(x)
sn2<-sd(x)^2*(n-1)/n;sn2
sn<-sqrt(sd(x)^2*(n-1)/n);sn
round(sn,3)

#Ks spljostenosti i ka asimetrije

mi4<-mean((x-xn)^4)
mi3<-mean((x-xn)^3)
mi2<-mean((x-xn)^2)

Ks<-mi4/mi2^2;Ks
Ka<-mi3/mi2^(3/2);Ka

#empirsika f-ja raspodel
plot.ecdf(x)
table(x)/n

cumsum(table(x))/n
hist(x)
mi<-c(80,100,130,170,220) #ovo ce biti na kol
hist(x,breaks = mi)

#kvartyili
summary(x)
q1<-quantile(x,0.25);q1
quantile(x,0.75)
IQR(x) #interaktivni razmak

#qq plot
qqnorm(x)
qqline(x)
boxplot(x)

