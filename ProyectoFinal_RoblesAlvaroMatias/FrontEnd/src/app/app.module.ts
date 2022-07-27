import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoArgPComponent } from './components/logo-arg-p/logo-arg-p.component';
import { BannerComponent } from './components/banner/banner.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';
import { LaboralComponent } from './components/laboral/laboral.component';
import { EstudiosComponent } from './components/estudios/estudios.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { SkillComponent } from './components/skill/skill.component';
import { ProyectosComponent } from './components/proyectos/proyectos.component';
import { FooterComponent } from './components/footer/footer.component';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { FormsModule } from '@angular/forms';
import { interceptorProvider } from './service/interceptor-service';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoArgPComponent,
    BannerComponent,
    AcercaDeComponent,
    LaboralComponent,
    EstudiosComponent,
    SkillComponent,
    ProyectosComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule,
    FormsModule,
  ],
  providers: [
    interceptorProvider
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
