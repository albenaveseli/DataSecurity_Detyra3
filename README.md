# Secure Password Manager with AES Encryption and Multi-Device Sync

Ky është një aplikacion për menaxhimin e fjalëkalimeve që siguron ruajtjen e kredencialeve të përdoruesit në mënyrë të enkriptuar duke përdorur algoritmin AES.

## Karakteristikat
- Gjenerim i fjalëkalimeve të forta
- Enkriptim dhe dekriptim me AES
- Organizim i fjalëkalimeve sipas kategorive
- Sinkronizim bazik përmes ruajtjes në një skedar të jashtëm

## Si të përdorni
1. Kompiloni projektin:
```bash
javac -d bin src/**/*.java
```
2. Ekzekutoni aplikacionin:
```bash
java -cp bin Main
```

## Strukturë e Projektit
- `model/Credential.java`: Përfaqëson kredencialet (emër përdoruesi, fjalëkalim, kategori)
- `utils/AESUtil.java`: Enkripton dhe dekripton të dhënat me AES
- `utils/PasswordGenerator.java`: Gjeneron fjalëkalime të rastësishme dhe të forta
- `service/PasswordManager.java`: Menaxhon shtimin, ruajtjen dhe leximin e kredencialeve
- `data/credentials.enc`: Skedari i enkriptuar me të dhënat
