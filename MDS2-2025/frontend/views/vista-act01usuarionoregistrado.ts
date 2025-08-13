import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-act01usuarionoregistrado')
export class VistaAct01usuarionoregistrado extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout id="vaadinVerticalLayout4" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; justify-content: space-around;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout id="vaadinVerticalLayout2" style="width: 100%;">
   <vaadin-vertical-layout id="usuarios" style="width: 100%; height: 90%;"></vaadin-vertical-layout>
   <vaadin-button id="masUsuarios" style="align-self: center;" tabindex="0">
     Más usuarios 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="centro" style="width: 100%;">
   <vaadin-vertical-layout id="vaadinVerticalLayout1" style="width: 100%; height: 50%;"></vaadin-vertical-layout>
   <vaadin-button id="Imagen" style="align-self: center; width: 40%; height: 50%;" tabindex="0">
     Imagen 
   </vaadin-button>
   <vaadin-button id="sesion" style="align-self: center;" tabindex="0">
     Iniciar Sesión 
   </vaadin-button>
   <vaadin-button id="registro" style="align-self: center;" tabindex="0">
     Registrarse 
   </vaadin-button>
   <vaadin-button id="google" style="align-self: center;" tabindex="0">
     Iniciar Sesión con Google 
   </vaadin-button>
   <vaadin-vertical-layout id="vaadinVerticalLayout" style="width: 100%; height: 90%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="vaadinVerticalLayout3" style="width: 100%;">
   <vaadin-vertical-layout id="hashtags" style="width: 100%; height: 90%;"></vaadin-vertical-layout>
   <vaadin-button id="masHashtags" style="align-self: center;" tabindex="0">
     Más hashtags 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
