create table player(id int PRIMARY KEY,name char(255),shirtname char(255),japanese char(255),spacing char(255),commentary char(255),age tinyint,
                       notionality char(255),foot char(255), weight int ,height int ,form char(255),growth_type int,market_price int,
                       position_fit char(255),position char(255),card_s char(255),card_p char(255),club_team char(255),number int,national_player char(255));
                       
create table technique(id int primary key,attack tinyint,defence tinyint,header_acc tinyint,dribble_acc tinyint,short_pass_acc tinyint,short_pass_speed tinyint,
                          long_pass_acc tinyint,long_pass_speed tinyint,shot_acc tinyint,place_kick tinyint,swerve tinyint,ball_ctrl tinyint,weak_foot_acc tinyint,
                          weak_foot_frequency tinyint,goalkeeping_skills tinyint);
                          
create table speed(id int primary key,response tinyint,explosive_power tinyint,dribble_speed tinyint,top_speed tinyint);

create table body(id int primary key,body_balance tinyint,stamina tinyint,kicking_power tinyint,jump tinyint,injury char(255));
                          
create table willpower(id int primary key,tenacity tinyint,teamwork tinyint,attack_awareness tinyint,defence_awareness tinyint);

create table player_style(id int primary key,skin_color tinyint,skin_texture tinyint,face_mode char(255),linked_face tinyint,face_slot int,linked_hair tinyint,hair_slot int,
                             boots tinyint,untucked_shirt tinyint,tight_kit tinyint,gloves tinyint,dribble_style tinyint,free_kick_style tinyint,penalty_kick_style tinyint,
                             drop_kick_style tinyint,goal_celebration_style_1 tinyint,goal_celebration_style_2 tinyint);

create table player_all(id int PRIMARY KEY,name char(255),shirtname char(255),japanese char(255),spacing char(255),commentary char(255),age tinyint,
                       notionality char(255),foot char(255), weight int ,height int ,form char(255),growth_type int,market_price int,
                       position_fit char(255),position char(255),card_s char(255),card_p char(255),club_team char(255),number int,national_player char(255),
                       attack tinyint,defence tinyint,header_acc tinyint,dribble_acc tinyint,short_pass_acc tinyint,short_pass_speed tinyint,
                       long_pass_acc tinyint,long_pass_speed tinyint,shot_acc tinyint,place_kick tinyint,swerve tinyint,ball_ctrl tinyint,weak_foot_acc tinyint,
                       weak_foot_frequency tinyint,goalkeeping_skills tinyint,response tinyint,explosive_power tinyint,dribble_speed tinyint,top_speed tinyint,
                       body_balance tinyint,stamina tinyint,kicking_power tinyint,jump tinyint,injury char(255),tenacity tinyint,teamwork tinyint,attack_awareness tinyint,
                       defence_awareness tinyint);
                       
create table team();

commit;