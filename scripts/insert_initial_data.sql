INSERT INTO DYSCIPLINA VALUES (1, 'Дисципліна');
INSERT INTO DYSCIPLINA VALUES (2, 'Спеціальність');

INSERT INTO INSTITUTE VALUES (1, 'НАУ','Національний авіаційний університет');
INSERT INTO INSTITUTE VALUES (2, 'АКІ','Аерокосмічний інститут');
INSERT INTO INSTITUTE VALUES (3, 'ІДП','Інститут доуніверситетської підготовки');
INSERT INTO INSTITUTE VALUES (4, 'ІЗДН','Інститут заочного та дистанційного навчання');
INSERT INTO INSTITUTE VALUES (5, 'ІПН','Інститут післядипломного навчання');
INSERT INTO INSTITUTE VALUES (6, 'ІІДС','Інститут інформаційно-діагностичних систем');
INSERT INTO INSTITUTE VALUES (7, 'ІМВ','Інститут – міжнародних відносин');
INSERT INTO INSTITUTE VALUES (8, 'ІНТ','Інститут новітніх технологій');
INSERT INTO INSTITUTE VALUES (9, 'ІАСУ','Інститут аерокосмічних систем управління');
INSERT INTO INSTITUTE VALUES (10, 'ПВН','Інститут землевпорядкування та інформаційних технологій при Національному авіаційному університеті');
INSERT INTO INSTITUTE VALUES (11, 'ПЕК НАУ','Промислово-економічний коледж Національного авіаційного університету');
INSERT INTO INSTITUTE VALUES (12, 'КІТтаЗ НАУ','Коледж інформаційних технологій та землевпорядкування Національного авіаційного університету');
INSERT INTO INSTITUTE VALUES (13, 'КРАУСС НАУ','Криворізький коледж (КРАУСС) Національного авіаційного університету');
INSERT INTO INSTITUTE VALUES (14, 'СК НАУ','Слов’янський коледж Національного авіаційного університету');
INSERT INTO INSTITUTE VALUES (15, 'ІICAO','Інститут ICAO');
INSERT INTO INSTITUTE VALUES (16, 'КЛК НАУ','Кременчуцький льотний коледж Національного авіаційного університету');
INSERT INTO INSTITUTE VALUES (17, 'ІМГ','У минулому ІМГ');
INSERT INTO INSTITUTE VALUES (18, 'ІЕМ','Інститут економіки та менеджменту');
INSERT INTO INSTITUTE VALUES (19, 'ГМІ','Гуманітарний інститут');
INSERT INTO INSTITUTE VALUES (20, 'ІПКП','Інститут повітряного і космічного права');
INSERT INTO INSTITUTE VALUES (21, 'ІАН','Інститут аеронавігації');
INSERT INTO INSTITUTE VALUES (22, 'ІАП','Інститут аеропортів');
INSERT INTO INSTITUTE VALUES (23, 'ІЕБ','Інститут екологічної безпеки');
INSERT INTO INSTITUTE VALUES (24, 'ЮІ','Юридичний інститут');
INSERT INTO INSTITUTE VALUES (25, 'ВІ','Військовий інститут');
INSERT INTO INSTITUTE VALUES (26, 'ІКІТ','Інститут комп’ютерних інформаційних технологій');


INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (1, 'Кафедра ІСАО', 'ІСАО', 15);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (2, 'Ремонту та експлуатації БАК та РТЗ', 'РЕБР', 1);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (3, 'Механіки', 'КМ', 2);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (4, 'Машинознавства', 'Маш', 2);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (5, 'Авіаційних двигунів', 'АД', 2);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (6, 'Теоретичної  та прикладної фізики', 'ТПФ', 2);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (7, 'Автоматизації та енергоменеджмент', 'АЕМ', 2);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (8, 'Конструкції літальних апаратів', 'КЛА', 2);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (9, 'Технологій відновлення авіаційної техніки', 'ТВАТ', 2);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (10, 'Збереження льотної придатності авіаційної техніки', 'ЗЛПАТ', 2);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (11, 'Гідрогазових систем', 'ГС', 2);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (12, 'Аеродинаміки та безпеки польотів літальних апаратів', 'АЛЕ', 2);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (13, 'Технологій аеропортів систем', 'ТА', 2);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (14, 'Електроніки', 'Ел', 21);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (15, 'Аеронавігаційних систем', 'АС', 21);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (16, 'Радіоелектронних пристроїв та систем', 'РПС', 21);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (17, 'Телекомунікаційних систем', 'ТС', 21);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (18, 'Авіаційних радіоелектронних комплексів', 'РМ', 21);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (19, 'Систем управління літальних апаратів', 'СУЛА', 21);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (20, 'Авіоніки', 'АВ', 21);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (21, 'Авіаційної англійської мови', 'ААМ', 21);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (22, 'Біокібернетики та аерокосмічної медицини', 'БКАМ', 6);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (23, 'Компютеризованих електротехнічних систем та технологій', 'ЕС', 6);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (24, 'Авіаційних комп’ютерно-інтегрованих комплексів', 'АКІК', 6);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (25, 'Загальної фізики', 'ЗФ', 6);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (26, 'Прикладної математики', 'ПМ', 6);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (27, 'Інформаційно-вимірювальних систем', 'ІВС', 6);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (28, 'Засобів захисту інформації', 'ЗЗІ', 6);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (29, 'Прикладної інформатики', 'ПІ', 26);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (30, 'Комп''ютерних систем та мереж', 'КСМ', 26);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (31, 'Комп''ютеризованих систем управління', 'КСУ', 26);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (32, 'Інженерії програмного забезпечення', 'ІПЗ', 26);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (33, 'Комп''ютерних інформаційних технологій', 'КІТ', 26);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (34, 'Вищої та обчислювальної математики', 'ВОМ', 26);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (35, 'Комп’ютерних мультимедійних технологій', 'КМТ', 26);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (36, 'Комп’ютеризованих систем захисту інформації', 'КСЗІ', 26);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (37, 'Безпеки інформаційних технологій', 'БІТ', 26);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (38, 'Комп’ютерних технологій дизайну і графіки', 'КТДГ', 22);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (39, 'Реконструкції аеропортів та автошляхів', 'РАПАШ', 22);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (40, 'Комп’ютерних технологій будівництва', 'КТБ', 22);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (41, 'Основ архітектури та дизайну (Рисунку, живопису та скульптури)', 'РЖС', 22);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (42, 'Архітектури', 'Арх.', 22);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (43, 'Дизайну інтер’єру', 'КТД', 22);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (44, 'Містобудування(Теорії архітектури та містобудування)', 'М(ТАМ)', 22);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (45, 'Безпеки життєдіяльності', 'БЖД', 23);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (46, 'Хімії і хімічної технології', 'ХХТ', 23);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (47, 'Екології', 'ЕК', 23);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (48, 'Землеустрою та кадастру', 'ЗТ', 23);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (49, 'Аерокосмічної геодезії', 'АГ', 23);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (51, 'Біотехнології', 'БТ', 23);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (52, 'Економіки', 'ЕК', 18);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (53, 'Економічної кібернетики', 'ФЕК', 18);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (54, 'Маркетингу та ресурсозабезпечення', 'МРЗ', 18);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (55, 'Фінансів,обліку і аудиту', 'ФОА', 18);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (56, 'Міжнародної економіки', 'МЕ', 18);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (57, 'Міжнародних економічних відносин і бізнесу', 'МЕВ', 7);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (58, 'Міжнародного права', 'МП', 7);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (59, 'Іноземних мов', 'ІМ', 7);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (60, 'Журналістики', 'Журн.', 7);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (61, 'Країнознавства і туризму', 'КТ', 7);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (62, 'Міжнародного бізнесу', 'МБ', 7);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (63, 'Міжнародної інформації', 'МІ', 7);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (64, 'Вищої математики', 'ВМ', 18);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (65, 'Менеджменту організацій', 'МО', 18);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (66, 'Організації авіаційних перевезень', 'ОАП', 18);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (67, 'Організації авіаційних робіт і послуг', 'ОАРП', 18);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (68, 'Менеджменту зовнішньоекономічної діяльності підприємств', 'МЗЕДП', 18);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (69, 'Економічної теорії', 'ЕТ', 18);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (70, 'Логістики', 'Логіст', 18);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (71, 'Теорії та історії держави і права', 'ТтаІДП', 24);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (72, 'Конституційного і адміністративного права', 'КАП', 24);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (73, 'Кримінального права і процесу', 'КПП', 24);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (74, 'Цивільного права і процесу', 'ЦПП', 24);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (75, 'Повітряного та космічного права', 'ПКП', 24);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (76, 'Господарського права і процесу', 'ГПП', 24);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (77, 'Факультету підготовки офіцерів запасу', 'ФПОЗ', 1);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (78, 'Базових і спеціальних дисциплін', 'БСД', 3);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (79, 'Дистанційного навчання', 'ДН', 4);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (80, 'Електроніки', 'Ел', 4);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (81, 'Аеронавігаційних систем', 'АС', 4);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (82, 'Радіоелектронних пристроїв та систем', 'РПС', 4);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (83, 'Телекомунікаційних систем', 'ТС', 4);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (84, 'Авіаційних радіоелектронних комплексів', 'РМ', 4);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (85, 'Підвищення кваліфікації персоналу та керівного складу авіації', 'ПКПКСА', 5);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (86, 'Подовження професіональної підготовки', 'ППП', 5);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (87, 'Технологій управління', 'ТУ', 5);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (88, 'Філологічних та природничих дисциплін', 'ФРІС', 1);

INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (89, 'Українознавства', 'УЗ', 19);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (90, 'Іноземних мов за фахом', 'ІМзаФ', 19);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (91, 'Англійської філології і перекладу', 'АФП', 19);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (92, 'Педагогіки та психохології професійної освіти', 'ПППО', 19);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (93, 'Іноземних мов і прикладної лінгвістики', 'ІМПЛ', 19);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (94, 'Політології та соціальних технологій', 'ПСТ', 19);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (95, 'Іноземної філології', 'ІФ', 19);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (96, 'Фізичного виховання', 'ФВ', 19);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (97, 'Історії та документознавства', 'ІК', 19);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (98, 'Філософії', 'ФІЛ', 19);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (99, 'Авіаційної психології', 'АП', 19);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (100, 'Спортивної підготовки', 'СП', 19);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (101, 'Факультет лінгвістики', 'ФЛ', 19);
INSERT INTO KAFEDRA(KAFEDRA_ID, NAME, CODE, INSTITUTE_ID) VALUES (102, 'Факультет психології та соціології', 'ФПС', 19);