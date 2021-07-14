{
    let string = ""
    
        list = ["Human","Droid","Wookie","Rodian","Hutt","Yoda's species","Trandoshan","Mon Calamari","Ewok","Sullustan","Neimodian","Gungan","Toydarian","Dug","Twi'lek","Aleena","Vulptereen","Xexto","Toong","Cerean","Nautolan","Zabrak","Tholothian","Iktotchi","Quermian","Kel Dor","Chagrian","Geonosian", "Mirialan","Clawdite","Besalisk","Kaminoan","Skakoan","Muun","Togruta","Kaleesh","Pau'an"]
    
        for(let i = 0;i<list.length;i++){
           string+=`<option>${list[i]}</option>`
        }
    
    document.getElementById('race').innerHTML = string;
    }
    
    {
    let string = ""
    
    list = ['none', 'white', 'grey', 'pale', 'tan', 'brown', 'black', 'red', 'orange', 'yellow', 'green', 'blue', 'magenta', 'purple', 'pink']
    
    for(let i = 0;i<list.length;i++){
       string+=`<option>${list[i]}</option>`
    }
    
    document.getElementById('skin').innerHTML = string;
    }
    
    {
    let string = ""
    
    list = ['none', 'blonde', 'brown', 'black', 'red', 'white']
    
    for(let i = 0;i<list.length;i++){
       string+=`<option>${list[i]}</option>`
    }
    
    document.getElementById('hair').innerHTML = string;
    }
    
    {
        let string = ""
        
        list = ['none', 'blonde', 'brown', 'black', 'red', 'white']
        
        for(let i = 0;i<list.length;i++){
           string+=`<option>${list[i]}</option>`
        }
        
        document.getElementById('eye').innerHTML = string;
    }
    
    {
        let string = ""
        
        list = ['Luke Skywalker', 'C-3PO', 'R2-D2', 'Darth Vader', 'Leia Organa', 'Owen Lars', 'Beru Whitesun Lars', 'R5-D4', 'Biggs Darklighter', 'Obi-Wan Kenobi', 'Anakin Skywalker', 'Wilhuff Tarkin', 'Chewbacca', 'Han Solo', 'Greedo', 'Jabba Desilijic Tiure', 'Wedge Antilles', 'Jek Tono Porkins', 'Yoda', 'Palpatine', 'Boba Fett', 'IG-88', 'Bossk', 'Lando Calrissian', 'Lobot', 'Ackbar', 'Mon Mothma', 'Arvel Crynyd', 'Wicket Systri Warrick', 'Nien Nunb', 'Qui-Gon Jinn', 'Nute Gunray', 'Finis Valorum', 'Padmé Amidala', 'Jar Jar Binks', 'Roos Tarpals', 'Rugor Nass', 'Ric Olié', 'Watto', 'Sebulba', 'Quarsh Panaka', 'Shmi Skywalker', 'Darth Maul', 'Bib Fortuna', 'Ayla Secura', 'Ratts Tyerel', 'Dud Bolt', 'Gasgano', 'Ben Quadinaros', 'Mace Windu', 'Ki-Adi-Mundi', 'Kit Fisto', 'Eeth Koth', 'Adi Gallia', 'Saesee Tiin', 'Yarael Poof', 'Plo Koon', 'Mas Amedda', 'Gregar Typho', 'Cordé', 'Cliegg lars', 'Poggle the Lesser', 'Luminara Unduli', 'Barriss Offee', 'Dormé', 'Dooku', 'Bail Prestor Organa', 'Jango Fett', 'Zam Wesell', 'Dexter Jettster', 'Lama Su', 'Taun We', 'Jocasta Nu', 'R4-P17', 'Wat Tambor', 'San Hill', 'Shaak Ti', 'Grievous', 'Tarfful', 'Raymus Antilles', 'Sly Moore', 'Tion Medon']
        
        for(let i = 0;i<list.length;i++){
           string+=`<option>${list[i]}</option>`
        }
        
        document.getElementById('copilot').innerHTML = string;
    }