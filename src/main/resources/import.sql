-- INSERT PLANETS

INSERT INTO planet (name) VALUES ('Tatooine'), ('Alderaan'), ('Yavin IV'), ('Hoth'), ('Dagobah'), ('Bespin'), ('Endor'), ('Naboo');
INSERT INTO planet (name) VALUES ('Coruscant'), ('Kamino'), ('Geonosis'), ('Utapau'), ('Mustafar'), ('Kashyyyk'), ('Polis Massa');
INSERT INTO planet (name) VALUES ('Mygeeto'), ('Felucia'),  ('Cato Neimoidia'),  ('Saleucami'),  ('Stewjon'), ('Eriadu'), ('Corellia');
INSERT INTO planet (name) VALUES ('Rodia'), ('Nal Hutta'), ('Dantooine'), ('Bestine IV'), ('Ord Mantell'), ('UNKNOWN'), ('Trandosha');
INSERT INTO planet (name) VALUES ('Socorro'), ('Mon Cala'), ('Chandrila'), ('Sullust'), ('Toydaria'), ('Malastare'), ('Dathomir');
INSERT INTO planet (name) VALUES ('Ryloth'), ('Aleen Minor'), ('Vulpter'), ('Troiken'), ('Tund'), ('Haruun Kal'), ('Cerea');
INSERT INTO planet (name) VALUES ('Glee Anselm'), ('Iridonia'), ('Tholoth'), ('Iktotch'), ('Quermia'), ('Dorin'), ('Champala');
INSERT INTO planet (name) VALUES ('Mirial'), ('Serenno'), ('Concord Dawn'), ('Zolan'), ('Ojom'), ('Skako'), ('Muunilinst'), ('Shili');
INSERT INTO planet (name) VALUES ('Kalee'), ('Umbara');

-- INSERT USERS

INSERT INTO users (USERNAME, PASS, NAME, RACE, SKIN_COLOR, HAIR_COLOR, EYE_COLOR, CREDITS, STARSHIP, MODEL, COPILOT, PLANET_NAME, BOUNTY) VALUES ('thomaspceci', 'pass', 'Qel', 'Mirialan', 'Green', 'White', 'Indigo', 23000, 'Shemzi', 'Star Courier', 'San Hill', 'Tatooine', 500);
INSERT INTO users (USERNAME, PASS, NAME, RACE, SKIN_COLOR, HAIR_COLOR, EYE_COLOR, CREDITS, STARSHIP, MODEL, COPILOT, PLANET_NAME, BOUNTY) VALUES ('andregoulbourne', 'pass', 'Aram Acheron', 'Chagrian', 'Blue', 'None', 'Blue', 32000, 'Logue Rock', 'H-type Nubian yacht', 'Bib Fortuna', 'Tatooine', 500);
INSERT INTO users (USERNAME, PASS, NAME, RACE, SKIN_COLOR, HAIR_COLOR, EYE_COLOR, CREDITS, STARSHIP, MODEL, COPILOT, PLANET_NAME, BOUNTY) VALUES ('nopsal', 'pass', 'Puw''kizi', 'Twi''lek', 'Red', 'None', 'Orange', 5000, 'Yomraju', 'Solar Sailer', 'Mas Amedda', 'Tatooine', 500);
INSERT INTO users (USERNAME, PASS, NAME, RACE, SKIN_COLOR, HAIR_COLOR, EYE_COLOR, CREDITS, STARSHIP, MODEL, COPILOT, PLANET_NAME, BOUNTY) VALUES ('ramarier11', 'pass', 'Ocalt Pasaac', 'Kel Dor', 'Orange', 'None', 'Silver', 13400, 'Yikhuha Roln', 'Theta-class T-2c shuttle', 'Tarfful', 'Tatooine', 500);
INSERT INTO users (USERNAME, PASS, NAME, RACE, SKIN_COLOR, HAIR_COLOR, EYE_COLOR, CREDITS, STARSHIP, MODEL, COPILOT, PLANET_NAME, BOUNTY) VALUES ('JakeGeiser', 'pass', 'Modi Boddoss', 'Nautolan', 'Blue', 'None', 'Black', 27900, 'Seacellon', 'J-type star skiff', 'Eeth Koth', 'Tatooine', 500);

-- -- -- INSERT RIDDLES

INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Walks in a zephyr / Stands when it''s wetter / Counts time, stops clocks / Swallows kingdoms, gnaws rocks', 'sand', 'Tatooine');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('A thousand colored folds stretch toward the sky / Atop a tender strand, rising from the land, ''til killed by maiden''s hand / Perhaps a token of love, perhaps to say goodbye', 'flower', 'Alderaan');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Has roots as nobody sees / Is taller than trees / Up, up it goes / And yet never grows', 'mountain', 'Yavin IV');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Dropping down from the sky / More beautiful than rain / There are no two pieces / That ever look the same', 'snow', 'Hoth');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('I eat Goblin, Snake and Spider / I eat Giants, Drakes and Walking Bone / I eat Soldier, Hunter, Squire / But simple fish I leave alone', 'water', 'Dagobah');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('I fly, yet I have no wings / I roar, yet I have no voice / I cry, yet I have no eyes / I''m free, yet I have no choice', 'cloud', 'Bespin');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Can run but never walks / Has a mouth and never talks / Has a head but never weeps / Has a bed but never sleeps', 'river', 'Endor');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('I seem shallow, but I am deep / Hidden realms, I doth keep / Lives I take, but food I offer / When pacific, I may chauffeur', 'ocean', 'Naboo');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('What building has the most stories?', 'library', 'Coruscant');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Many-manned scud-thumper / Maker of worn wood, Shrub-ruster / Sky-mocker, Rave! / Portly pusher, Wind-slave', 'ocean', 'Kamino');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('You see me blink, but not my eyes / I wink and wink to fraternize / And if I wink at her just right / Then I may find my love tonight', 'firefly', 'Geonosis');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('It can''t be seen, can''t be felt / Can''t be heard, can''t be smelt / It lies behind stars and under hills / And empty holes it fills / It comes first and follows after / Ends life, kills laughter', 'darkness', 'Utapau');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Where the first appears, I will follow / All things I touch, I try to swallow / Always hungry, always must I be fed / And fingers I lick, will soon turn red', 'fire', 'Mustafar');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Wears rings without fingers, and leaves yet still lingers', 'tree', 'Kashyyyk');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Large as a mountain, small as a pea / Endlessly swimming in a waterless sea', 'asteroid', 'Polis Massa');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Regular patterns are my duty / Many shapes refine my beauty / Small as a pebble, tall as a tree / Lightsabers make use of me', 'crystal', 'Mygeeto');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Is thick but thin as a puff / Is short but tall as a bluff / Brings peace right after the rain / Dazzles us all again and again?', 'rainbow', 'Felucia');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('If you were to kiss one of these / Then your lips you might want to rinse / Although it might be worth trying / In case it turns into a prince', 'frog', 'Cato Neimoidia');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('I live as I die / I float as I dry / I wait with bated breath / As the years roll by', 'tree', 'Saleucami');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('In marble halls as white as milk / Lined with skin as soft as silk / No doors there are to this stronghold / Yet thieves break in and steal its gold', 'egg', 'Stewjon');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('It can speak / With its hard metal tongue / But it can not breathe / For it has no lung', 'bell', 'Eriadu');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('I''m bright but not clever / I burn, but''m not an ember / I twinkle, but''m not an eye / I seem immortal, but eventually die', 'star', 'Corellia');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('I sizzle like bacon, but am made with an egg / I''ve plenty of backbone, but lack a good leg / I peel layers like onions, but still remain whole / I can be as long as a man, yet fit in a hole', 'snake', 'Rodia');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('If a man carried my burden / He would break his back / I''m not rich / But leave silver in my track', 'snail', 'Nal Hutta');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('You''ll find him on the mountain / You''ll find him in the creeks / From all tongues emerge a fountain / He has no mouth and yet he speaks', 'echo', 'Dantooine');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Alive as you but without breath / As cold in my life as in my death / Never a thirst though I always drink / Dressed in a mail but never a clink', 'fish', 'Bestine IV');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Thirty white horses / Standing on a red hill / First they stomp / Then they chomp / Then they stand still', 'teeth', 'Ord Mantell');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('A leathery snake / With a stinging bite / I stay coiled up / Unless I must fight', 'whipWi', 'Trandosha');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Only one color, but not one size / Stuck at the bottom, yet I easily fly / Present in sun, but not in rain / Doing no harm, and feeling no pain', 'shadow', 'Socorro');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('The Moon is my father / The Sea is my mother / I''m hard to notice / Amongst thousands of brothers', 'wave', 'Mon Cala');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('I''m on land, but on sea / I''m an idea, yet can rot / I am two but am none / I am and yet am not', 'paradox', 'Chandrila');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('My brothers are gone, but here I stay / For years and years, my debt to repay / Blackened all they left behind / A trail of destruction, easy to find', 'ash', 'Sullust');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('You can''t see, hear or feel, until its to late / What shadows love, and shopkeepers hate', 'theif', 'Toydaria');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('I bubble and laugh / And spit water in your face / I''m no lady / And I do not wear lace', 'fountain', 'Malastare');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('You can see me, the firstborn of four / You can''t touch me, a sign to not ignore / You can smell me, as I creep under your door / I steal your breath and leave you with no more', 'smoke', 'Dathomir');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Fatherless and Motherless / Born without sin / Roared when it appeared / And never spoke again', 'thunder', 'Ryloth');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Listen closely, I''m hard to understand / I''m as elusive as is a handful of sand / Even if you perceive me, you know me not / Before you can tell me, what I''ve forgot', 'riddle', 'Aleen Minor');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Who makes it, has no need of it / Who buys it, has no use for it / Who uses it, can not see it / Who sees it, does not want it', 'coffin', 'Vulpter');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('My sides are firmly laced about / Yet nothing is within / You think my head is strange indeed / Being nothing else but skin', 'drum', 'Troiken');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Hard to catch / Easy to hold / Can''t be seen / Unless it''s cold', 'breath', 'Tund');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('I fly through the air / On small feathered wings / Seeking out life and / Destroying all things', 'arrow', 'Haruun Kal');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('The rich men want it / The wise men know it / The poor all need it / The kind men show it', 'love', 'Cerea');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Through wind and rain I always play / I roam the earth, yet here I stay / I crumble stones, and fire can''t burn me / Yet I''m soft-you can easily pierce me', 'ocean', 'Glee Anselm');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('If you have me, you want to tell me / If you tell me, you do not have me', 'secret', 'Iridonia');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('It comes in on little cat feet / Is neither sour, nor sweet / Hovers in the air / And then is not there', 'fog', 'Tholoth');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Shifting, shifting, drifting deep / Below me great and mighty cities sleep / Swirling, scurlling, all around / I''m only where no water will be found', 'desert', 'Iktotch');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Until I''m measured / I''m not known / Yet how you miss me / When I''ve flown', 'time', 'Quermia');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Turn us on our backs / And open up our stomachs / You will be the wisest of men / Though at start, a lummox', 'book', 'Dorin');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('A fisherman catches 30 fish in a 5-day fishing competition. Each day he catches 3 more than the last. How many fish did he catch on the first day?', '0', 'Champala');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('As beautiful as the setting sun / As delicate as the morning dew / An angel dusting from the stars / That can turn the land into a frosted moon', 'snow', 'Mirial');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Make me thy lyre, even as the forests are / What if my leaves fell like its own / The tumult of thy mighty harmonies / Will take from both a deep autumnal tone', 'wind', 'Serenno');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('I cut through evil like a double edged sword / Balance I single-handedly upraise / Through battles fought with heart and mind / Instead of with my gaze', 'justice', 'Concord Dawn');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('They can be harbored, but few hold water / You can nurse them, but only by holding them against someone else / You can carry them, but not with your arms / You can bury them, but not in the earth', 'grudge', 'Zolan');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Take off my skin / I will not cry / But you will / What Am I?', 'onion', 'Ojom');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('I have keys but do not lock /  You can enter but not come in / I have space but have no room / You can stroke me without chagrin', 'keyboard', 'Skako');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('I have branches / But no trunk / Roots or leaves / Yet creatures ''round me slunk ', 'bank', 'Muunilinst');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('What has wings, but can not fly / Is enclosed, but outside can also lie / What is it upon which I doth stand / Which can lead us to many different lands', 'stage', 'Shili');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('Ripped from my mother''s womb / Beaten and burned / I become a blood-thirsty slayer', 'iron', 'Kalee');
INSERT INTO riddle (riddle, answer, planet_name) VALUES ('My step is slow; snow is my breath / I give the ground a grinding death / My marching makes an end of me / Slain by sun or drowned by sea', 'glacier', 'Umbara');