package com.devtalles.tu_cv_spring_boot.tuCv.service;

import com.devtalles.tu_cv_spring_boot.tuCv.model.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CvInitializationServiceImpl implements CvInitializationService {

    @Override
    public CvData initializeCvData() {
        CvData cvData = new CvData();

        PersonalDetails personalDetails = new PersonalDetails();
        personalDetails.setFirstName("Fabio");
        personalDetails.setLastName("Torres");
        personalDetails.setEmail("fabioezequielt@gmail.com");
        personalDetails.setPhone("1137887356");
        personalDetails.setProvince("Buenos Aires");
        personalDetails.setProfessionalProfile("Full stack Developer");

        Education education1 = new Education();
        education1.setInstitution("Universidad Nacional de La Matanza");
        education1.setDescription("Tecnicatura Universitaria en Desarrollo Web");
        education1.setDegree("Técnico en Web");
        education1.setPeriod("2022 - 2025");

        Experience experience1 = new Experience();
        experience1.setJobTitle("Desarrollador Full stack");
        experience1.setCompany("NetOne");
        experience1.setDescription("Desarrollador Full stack con 3 años de experiencia");
        experience1.setPeriod("2023 - 2026");

        Skill skill1 = new Skill();
        skill1.setName("Java");
        skill1.setLevel("Avanzado");
        Skill skill2 = new Skill();
        skill2.setName("Angular");
        skill2.setLevel("Intermedio");
        Skill skill3 = new Skill();
        skill3.setName("MySQL");
        skill3.setLevel("Intermedio");
        Skill skill4 = new Skill();
        skill4.setName("Spring Boot");
        skill4.setLevel("Intermedio");
        Skill skill5 = new Skill();
        skill5.setName("Cypress");
        skill5.setLevel("Básico");
        Skill skill6 = new Skill();
        skill6.setName("Inglés");
        skill6.setLevel("A2 - Básico");

        cvData.setPersonalDetails(personalDetails);
        cvData.setEducations(Collections.singletonList(education1));
        cvData.setExperiences(List.of(experience1));
        cvData.setSkills(Arrays.asList(skill1, skill2, skill3, skill4, skill5, skill6));

        return cvData;
    }
}
