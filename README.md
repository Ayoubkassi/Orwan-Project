# Projet_GenieLogiciel
Mine ales S8 Projet

## SOUTENANCE: 14 avril
(demostration des realisations)

## Remise des livrables: 20 avril

## Livrables
- **Cahier des charges/Specifications**

  *Analyse du besoin*: modele de domaine (diagrammes de classes), exigences(modele Kaos)
  
  *Exigences fonctionnelles*: modele des usages (diagrammes de cas d'utilisation)
- **Dossier de conception**
  
  Architecture generale (diagrammes de packages)
  
  Architecture detaillee (diagrammes de classes)
  
  Fonctionnalites (diagrammes de classes)
  
  Modele conceptuel de donnees (diagrammes de classes)
- **Doissier de programmation**
  
  Documentation de l'implantation du logiciel (code)
- **Executable**
  
  archives jar (utilisation d'un serveur de BD H2)
  
### Analyse du besoin (Description in text here)

- Read existing CSV file and store the datas into our **DB H2**

- Compute the datas insides with Orowan.exe (provided by prof) once/200ms

- Compute the average last 5 friction coefficient in the results(Mean on 1s)

- Store level II and Orowan results datas into Time Series Database

- HMI (Human Machine Interface)

  1. User rights management （Hierarchical management）
    
    (1) Everyone
       
       Login / logout
    
    (2) Worker
       
       Stand ID (Location of a worker)
       
       display operation time of Orowan
       
       dispaly the datas of friction coefficient factor
    
    (3) Processer
    
       Add/remove/update the list of users/ user rights
       
       Change the range of level 2 datas
       
       Enable/ disable stand (accoding to the IDs)
       
  2. GUI : more beautifil
  
     (1) Show the curves of different datas in windows
         (Friction, Roll speed, Sigma)
     
     (2) Protectino for the users
     
         a. The entered password is displayed with *
         
         b. Password is saved in the database in non-clear code (encrypted)
         
         c. Set captcha to prevent brute force cracking
        
     (3) To be added (**exept more ideas!! **) 
     
  3. Show data from Database into the HMI
      
       
       

### Exigences fonctionnelles (Description in text here)
