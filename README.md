POST http://localhost:8081/ws/addService?wsdl
Content-Type: text/xml?charset=utf-8

```yaml
<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <add xmlns="http://calc.v.net/">
      <req>
        <x>1</x>
        <y>2</y>
      </req>
    </add>
  </soap:Body>
</soap:Envelope>
```

要求 1.8


