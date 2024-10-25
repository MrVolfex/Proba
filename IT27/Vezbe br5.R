set.seed(12345)
x<-runif(100)

n<-length(x)
k<-length(which(x>0.75))
z<-qnorm((1+0.9)/2)


a<-n^2+z^2*n
b<-(-2*k*n-z^2*n)
c<-k^2

D<-b^2-4*a*c

x1<-(-b-sqrt(D))/(2*a);x1
x2<-(-b+sqrt(D))/2/a;x2