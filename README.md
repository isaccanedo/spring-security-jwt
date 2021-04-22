# spring-security-jwt-example

JSON Web Tokens é um método RFC 7519 aberto e padrão da indústria para representar reivindicações de forma segura entre duas partes.

JWT.IO (https://jwt.io/) permite decodificar, verificar e gerar JWT.

# 1. O que é JSON Web Token?

JSON Web Token (JWT) é um padrão aberto (RFC 7519) que define uma forma compacta e independente para transmitir informações com segurança entre as partes como um objeto JSON. Essas informações podem ser verificadas e confiáveis porque estão assinadas digitalmente. Os JWTs podem ser assinados usando um segredo (com o algoritmo HMAC) ou um par de chaves pública / privada usando RSA ou ECDSA.

Embora os JWTs possam ser criptografados para fornecer sigilo entre as partes, nos concentraremos nos tokens assinados. Os tokens assinados podem verificar a integridade das declarações contidas nele, enquanto os tokens criptografados ocultam essas declarações de outras partes. Quando os tokens são assinados usando pares de chave pública / privada, a assinatura também certifica que apenas a parte que possui a chave privada é quem a assinou.

# 2. Quando você deve usar JSON Web Tokens?

Aqui estão alguns cenários em que JSON Web Tokens são úteis:

- Autorização: este é o cenário mais comum para usar o JWT. Depois que o usuário estiver conectado, cada solicitação subsequente incluirá o JWT, permitindo que o usuário acesse rotas, serviços e recursos permitidos com esse token. O Single Sign On é um recurso que usa amplamente o JWT atualmente, devido à sua pequena sobrecarga e sua capacidade de ser facilmente usado em diferentes domínios;

- Troca de informações: JSON Web Tokens são uma boa maneira de transmitir informações entre as partes com segurança. Como os JWTs podem ser assinados - por exemplo, usando pares de chaves pública / privada - você pode ter certeza de que os remetentes são quem dizem ser. Além disso, como a assinatura é calculada usando o cabeçalho e a carga útil, você também pode verificar se o conteúdo não foi adulterado.

# 3. Qual é a estrutura do JSON Web Token?
Em sua forma compacta, JSON Web Tokens consistem em três partes separadas por pontos (.), Que são:

- Cabeçalho;
- Carga útil;
- Assinatura.

Portanto, um JWT normalmente se parece com o seguinte.

```
xxxxx.yyyyy.zzzzz
```
Vamos analisar as diferentes partes.

### Cabeçalho
O cabeçalho normalmente consiste em duas partes: o tipo de token, que é JWT, e o algoritmo de assinatura que está sendo usado, como HMAC SHA256 ou RSA.

Por exemplo:
```
{
  "alg": "HS256",
  "typ": "JWT"
}
```
Então, esse JSON é codificado em Base64Url para formar a primeira parte do JWT.

