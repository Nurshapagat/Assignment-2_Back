🏋‍♂ Fitness Club Management System

Overview

This is a Fitness Club Management System - allows us 2 different services, for the gym and for yoga. 
That is, it returns to us people who participate in these services. 
They will indicate their id, name, type of Service involved, and payment amount.
Registering new members
Managing members types
And Payments

Project Structure
│── src
│   ├── main
│   │   ├── java
│   │   │   ├── org
│   │   │   │   ├── example
│   │   │   │   │   ├── config
│   │   │   │   │   │   ├── AppConfig.java
│   │   │   │   │   ├── entity
│   │   │   │   │   │   ├── Member.java
│   │   │   │   │   ├── repository
│   │   │   │   │   │   ├── MemberRepository.java
│   │   │   │   │   │   ├── MemberRepositoryIml.java
│   │   │   │   │   ├── service
│   │   │   │   │   │   ├── MembersService.java
│   │   │   │   │   │   ├── GymMemberService.java
│   │   │   │   │   │   ├── YogaMemberService.java
│   │   │   │   │   ├── beans
│   │   │   │   │   │   ├── EagerBean.java
│   │   │   │   │   │   ├── LazyBean.java
│   │   │   │   │   ├── Main.java
│   ├── pom.xml 
│── .gitignore
│── README.md

Expected Output:
EagerBean
Gym member: Member id=1, name='Aibek', membersType='Gym', payment=50000.0
Yoga member: Member id=2, name='Shapi', membersType='Yoga', payment=30000.0
LazyBean

Features

Member Registration: Add new members to the system.
Gym Membership Service
Yoga Membership Service

Singleton Beans:
Eager Bean (initialized at startup)
Lazy Bean (initialized only when needed)

